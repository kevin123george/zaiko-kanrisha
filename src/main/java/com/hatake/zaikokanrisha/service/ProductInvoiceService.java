//package com.hatake.zaikokanrisha.service;
//
//import com.hatake.zaikokanrisha.models.ProductInvoice;
//import com.hatake.zaikokanrisha.repository.ProductInvoiceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
////@Transactional
//@Service
//public class ProductInvoiceService {
//
//@Autowired
//    private ProductInvoiceRepository productInvoiceRepository;
//
//    public void insert(ProductInvoice productInvoice) {
//        productInvoiceRepository.save(productInvoice);
//    }
//
//
//    public Optional<ProductInvoice> findById(int id) {
//        return productInvoiceRepository.findById(id);
//    }
//
//    public Iterable<ProductInvoice> findAll() {
//        return productInvoiceRepository.findAll();
//    }
//
//    public void updateProductInvoice(ProductInvoice productInvoice) {
//        productInvoiceRepository.save(productInvoice);
//    }
//
//    public void deleteProductInvoice(ProductInvoice productInvoice) {
//        productInvoiceRepository.delete(productInvoice);
//    }
//
//
//
//}
