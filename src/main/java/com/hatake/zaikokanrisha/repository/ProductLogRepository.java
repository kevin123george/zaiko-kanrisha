package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.ProductLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLogRepository extends JpaRepository<ProductLogEntity,Integer> {
}
