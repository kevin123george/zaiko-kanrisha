package com.hatake.zaikokanrisha.controller;

import com.hatake.zaikokanrisha.models.Pricing;
//import com.hatake.zaikokanrisha.models.TheLogConverter;
import com.hatake.zaikokanrisha.service.PricingLogService;
import com.hatake.zaikokanrisha.service.PricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/categories/{id}/products/{id}/pricings")
public class PricingController {


    @Autowired
    public PricingService pricingService;
    @Autowired
    private PricingLogService pricingLogService;

    @RequestMapping("")
    public Iterable<Pricing> getAllPricing() {
        return pricingService.findAll();
    }


    @RequestMapping("/{id}")
    public Optional<Pricing> searchPricing(@PathVariable Integer id) {
        return pricingService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addPricing(@RequestBody Pricing pricing) {
        pricingService.insert(pricing);
//        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Pricing pricing) {
        pricingService.updatePricing(pricing);
//        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deletePricing(@RequestBody Pricing pricing) {
        pricingService.deletePricing(pricing);
//        pricingLogService.insert(TheLogConverter.pricingLogLogConverter(pricing));
    }


}

