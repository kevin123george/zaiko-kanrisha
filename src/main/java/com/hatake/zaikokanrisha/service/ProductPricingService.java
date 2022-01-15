package com.hatake.zaikokanrisha.service;

import com.hatake.zaikokanrisha.models.ProductPricing;
import com.hatake.zaikokanrisha.repository.ProductPricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Transactional
@Service
public class ProductPricingService {

@Autowired
    private ProductPricingRepository productPricingRepository;


    public void insert( ProductPricing productPricing) {
        productPricingRepository.save(productPricing);
    }


    public Optional< ProductPricing> findById(Integer id) {
        return productPricingRepository.findById(id);
    }

    public Iterable<ProductPricing> findAll() {
        return productPricingRepository.findAll();
    }

    public void updateProductPricing( ProductPricing productPricing) {
        productPricingRepository.save(productPricing);
    }

    public void deleteProductPricing( ProductPricing productPricing) {
        productPricingRepository.delete(productPricing);
    }


}
