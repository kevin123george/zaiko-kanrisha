package com.hatake.zaikokanrisha.models;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


/**
 * The persistent class for the stock database table.
 * 
 */
@Data
@Entity
@Table(	name = "stock",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "refId")
		})
public class Stock extends DateAudit{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer refId;

	private String branchId;

	private String createdUser;

	@Temporal(TemporalType.DATE)
	private Date dateStock;

	private String lastModifiedUser;

	private Integer quantity;

	//private Integer stockId;

	private BigDecimal version;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;

	//bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name="supplierId")
	private Supplier supplier;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	public Stock() {
	}

	public Integer getRefId() {
		return this.refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getDateStock() {
		return this.dateStock;
	}

	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
	}

	public String getLastModifiedUser() {
		return this.lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/*public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}*/

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}