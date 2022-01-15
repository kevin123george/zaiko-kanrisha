package com.hatake.zaikokanrisha.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(	name = "category",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "categoryId")
        })
public class Category extends DateAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String categoryName;

    private String createdUser;

    private String lastModifiedUser;

    private BigDecimal version;

    //bi-directional many-to-one association to Product
    @OneToMany(mappedBy="category")
    private List<Product> products;

    //bi-directional many-to-one association to Stock
    @OneToMany(mappedBy="category")
    private List<Stock> stocks;

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    public BigDecimal getVersion() {
        return this.version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @JsonIgnore
    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public Product addProduct(Product product) {
        getProducts().add(product);
        product.setCategory(this);

        return product;
    }

    public Product removeProduct(Product product) {
        getProducts().remove(product);
        product.setCategory(null);

        return product;
    }

    public List<Stock> getStocks() {
        return this.stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public Stock addStock(Stock stock) {
        getStocks().add(stock);
        stock.setCategory(this);

        return stock;
    }

    public Stock removeStock(Stock stock) {
        getStocks().remove(stock);
        stock.setCategory(null);

        return stock;
    }

}
