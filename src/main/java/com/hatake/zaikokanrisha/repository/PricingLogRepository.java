package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.PricingLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingLogRepository extends JpaRepository<PricingLogEntity,Integer> {
}
