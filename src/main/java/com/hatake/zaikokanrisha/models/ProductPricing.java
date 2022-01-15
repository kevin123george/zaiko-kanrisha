package com.hatake.zaikokanrisha.models;


import lombok.Data;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;


/**
 * The persistent class for the product_pricing database table.
 * 
 */
@Data
@Entity
@Table(	name = "product_pricing",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "refId")
		})
public class ProductPricing extends DateAudit{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer refId;

	//bi-directional many-to-one association to Pricing
	@ManyToOne
	private Pricing pricing;

	//bi-directional many-to-one association to Product
	@ManyToOne
	private Product product;

	public ProductPricing() {
	}

	public Integer getRefId() {
		return this.refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public Pricing getPricing() {
		return this.pricing;
	}

	public void setPricing(Pricing pricing) {
		this.pricing = pricing;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}