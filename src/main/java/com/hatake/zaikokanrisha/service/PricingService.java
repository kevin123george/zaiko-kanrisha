package com.hatake.zaikokanrisha.service;

import com.hatake.zaikokanrisha.models.Pricing;
import com.hatake.zaikokanrisha.repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

//@Transactional
@Service
public class PricingService {

    @Autowired
    private PricingRepository pricingRepository;


    @RequestMapping("")
    public Iterable<Pricing> getAllStock() {
        return pricingRepository.findAll();
    }

    public void insert(Pricing pricing) {
        pricingRepository.save(pricing);
    }


    public Iterable<Pricing> findAll() {
        return pricingRepository.findAll();
    }

    public Optional<Pricing> find(Integer id) {
        return pricingRepository.findById(id);
    }

    public void updatePricing(Pricing pricing) {
        pricingRepository.save(pricing);
    }

    public void deletePricing(Pricing pricing) {
        pricingRepository.delete(pricing);
    }


}
