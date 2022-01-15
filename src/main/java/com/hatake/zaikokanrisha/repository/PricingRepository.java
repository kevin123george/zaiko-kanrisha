package com.hatake.zaikokanrisha.repository;

import com.hatake.zaikokanrisha.models.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */
@Repository
public interface PricingRepository extends JpaRepository<Pricing, Integer> {


}
