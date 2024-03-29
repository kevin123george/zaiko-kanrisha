package com.hatake.zaikokanrisha.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the product_log database table.
 * 
 */
@Data
@Entity
@Table(	name = "product_log_entity",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "productId")
		})
public class ProductLogEntity extends DateAudit{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;

	private Integer categoryId;

	private String createdUser;

	private String lastModifiedUser;

	private Integer pricingId;

	private double productbuyingPrice;

	private byte productIsService;

	private String productName;

	private double productsellingPrice;

	private BigDecimal version;

	public ProductLogEntity() {
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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

	public Integer getPricingId() {
		return this.pricingId;
	}

	public void setPricingId(Integer pricingId) {
		this.pricingId = pricingId;
	}

	public double getProductbuyingPrice() {
		return this.productbuyingPrice;
	}

	public void setProductbuyingPrice(double productbuyingPrice) {
		this.productbuyingPrice = productbuyingPrice;
	}

	public byte getProductIsService() {
		return this.productIsService;
	}

	public void setProductIsService(byte productIsService) {
		this.productIsService = productIsService;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductsellingPrice() {
		return this.productsellingPrice;
	}

	public void setProductsellingPrice(double productsellingPrice) {
		this.productsellingPrice = productsellingPrice;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}