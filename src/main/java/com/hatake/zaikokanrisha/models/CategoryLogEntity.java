package com.hatake.zaikokanrisha.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(	name = "category_log_entity",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "categoryId")
        })
public class CategoryLogEntity  extends DateAudit{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int categoryId;

    private String categoryName;

    private String createdUser;

    private String lastModifiedUser;

    private BigDecimal version;

    public CategoryLogEntity() {
    }

    public CategoryLogEntity(String categoryName, String createdUser,
                             Date lastModifiedDateTime, BigDecimal version) {
        this.categoryName = categoryName;
        this.createdUser = createdUser;
        this.lastModifiedUser = lastModifiedUser;
        this.version = version;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName(String categoryName) {
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

}