package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
