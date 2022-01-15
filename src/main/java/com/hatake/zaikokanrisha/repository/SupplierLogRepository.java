package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.SupplierLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierLogRepository extends JpaRepository<SupplierLogEntity,Integer> {
}
