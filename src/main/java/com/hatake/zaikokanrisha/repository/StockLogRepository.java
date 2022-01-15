package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.StockLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockLogRepository extends JpaRepository<StockLogEntity,Integer> {
}
