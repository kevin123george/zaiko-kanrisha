package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.CategoryLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryLogRepository extends JpaRepository<CategoryLogEntity,Integer> {

}
