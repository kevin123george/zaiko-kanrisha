package com.hatake.zaikokanrisha.repository;


import com.hatake.zaikokanrisha.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Integer> {
}
