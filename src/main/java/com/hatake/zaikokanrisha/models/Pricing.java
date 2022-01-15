package com.hatake.zaikokanrisha.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * The persistent class for the pricing database table.
 * 
 */
@Data
@Entity
@Table(	name = "pricing",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "pricingId")
		})
public class Pricing extends DateAudit{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pricingId;

	private String createdUser;

	private String lastModifiedUser;

	private BigDecimal pricingDiscountPrecentage;

	@Temporal(TemporalType.DATE)
	private Date pricingEffectiveDate;

	@Temporal(TemporalType.DATE)
	private Date pricingExpireDate;

	private String pricingName;

	private BigDecimal version;

	//bi-directional many-to-one association to ProductPricing
	@OneToMany(mappedBy="pricing")
	private List<ProductPricing> productPricings;

	public Pricing() {
	}

	public Integer getPricingId() {
		return this.pricingId;
	}

	public void setPricingId(Integer pricingId) {
		this.pricingId = pricingId;
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

	public BigDecimal getPricingDiscountPrecentage() {
		return this.pricingDiscountPrecentage;
	}

	public void setPricingDiscountPrecentage(BigDecimal pricingDiscountPrecentage) {
		this.pricingDiscountPrecentage = pricingDiscountPrecentage;
	}

	public Date getPricingEffectiveDate() {
		return this.pricingEffectiveDate;
	}

	public void setPricingEffectiveDate(Date pricingEffectiveDate) {
		this.pricingEffectiveDate = pricingEffectiveDate;
	}

	public Date getPricingExpireDate() {
		return this.pricingExpireDate;
	}

	public void setPricingExpireDate(Date pricingExpireDate) {
		this.pricingExpireDate = pricingExpireDate;
	}

	public String getPricingName() {
		return this.pricingName;
	}

	public void setPricingName(String pricingName) {
		this.pricingName = pricingName;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public List<ProductPricing> getProductPricings() {
		return this.productPricings;
	}

	public void setProductPricings(List<ProductPricing> productPricings) {
		this.productPricings = productPricings;
	}

	public ProductPricing addProductPricing(ProductPricing productPricing) {
		getProductPricings().add(productPricing);
		productPricing.setPricing(this);

		return productPricing;
	}

	public ProductPricing removeProductPricing(ProductPricing productPricing) {
		getProductPricings().remove(productPricing);
		productPricing.setPricing(null);

		return productPricing;
	}

}