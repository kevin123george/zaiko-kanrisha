package com.hatake.zaikokanrisha.controller;

import com.hatake.zaikokanrisha.models.Product;
//import com.hatake.zaikokanrisha.models.TheLogConverter;
import com.hatake.zaikokanrisha.service.ProductLogService;
import com.hatake.zaikokanrisha.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("categories/{id}/products")
public class ProductController {


    @Autowired
    public ProductService productService;
    @Autowired
    private ProductLogService productLogService;


    @RequestMapping("")
    public Iterable<Product> getAllProducts() {
        return productService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Product> searchProduct(@PathVariable Integer id) {
        return productService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addProduct(@RequestBody Product product) {
        productService.insert(product);
//        productLogService.insert(TheLogConverter.productLogConverter(product));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
//        productLogService.insert(TheLogConverter.productLogConverter(product));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
//        productLogService.insert(TheLogConverter.productLogConverter(product));
    }


}
