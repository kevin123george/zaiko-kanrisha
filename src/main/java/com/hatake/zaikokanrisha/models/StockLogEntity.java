package com.hatake.zaikokanrisha.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


/**
 * The persistent class for the stock_log database table.
 * 
 */
@Data
@Entity
@Table(	name = "stock_log_entity",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "refId")
		})
public class StockLogEntity extends DateAudit{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer refId;

	private Integer categoryId;

	private String createdUser;

	@Temporal(TemporalType.DATE)
	private Date dateStock;

	private String lastModifiedUser;

	private Integer productId;

	private Integer quantity;

	//private Integer stockId;

	private Integer supplierId;

	private BigDecimal version;

	public StockLogEntity() {
	}

	public Integer getRefId() {
		return this.refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
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

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
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

	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}