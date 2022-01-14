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
public class CategoryLogEntity  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int categoryId;

    private String categoryName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

    private String createdUser;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDateTime;

    private String lastModifiedUser;

    private BigDecimal version;

    public CategoryLogEntity() {
    }

    public CategoryLogEntity(String categoryName, Date createdDateTime, String createdUser,
                             Date lastModifiedDateTime, String lastModifiedUser, BigDecimal version) {
        this.categoryName = categoryName;
        this.createdDateTime = createdDateTime;
        this.createdUser = createdUser;
        this.lastModifiedDateTime = lastModifiedDateTime;
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

    public Date getCreatedDateTime() {
        return this.createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(Date lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
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