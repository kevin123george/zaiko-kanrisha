package com.hatake.zaikokanrisha.models;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * The persistent class for the supplier database table.
 * 
 */
@Data
@Entity
@Table(	name = "supplier",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "supplierId")
		})
public class Supplier extends DateAudit{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer supplierId;

	private String createdUser;

	private String lastModifiedUser;

	private String supplierCompany;

	private BigDecimal supplierContact;

	private String supplierName;

	private BigDecimal version;

	//bi-directional many-to-one association to Stock
	@OneToMany(mappedBy="supplier")
	private List<Stock> stocks;

	public Supplier() {
	}

	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
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

	public String getSupplierCompany() {
		return this.supplierCompany;
	}

	public void setSupplierCompany(String supplierCompany) {
		this.supplierCompany = supplierCompany;
	}

	public BigDecimal getSupplierContact() {
		return this.supplierContact;
	}

	public void setSupplierContact(BigDecimal supplierContact) {
		this.supplierContact = supplierContact;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setSupplier(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setSupplier(null);

		return stock;
	}

}