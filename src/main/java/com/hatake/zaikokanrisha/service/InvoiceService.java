//package com.hatake.zaikokanrisha.service;
//
//import com.hatake.zaikokanrisha.models.Invoice;
//import com.hatake.zaikokanrisha.repository.InvoiceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
////@Transactional
//@Service
//public class InvoiceService {
//
//    @Autowired
//    private InvoiceRepository invoiceRepository;
//
//    public void insert(Invoice invoice) {
//        invoiceRepository.save(invoice);
//    }
//
//
//    public Optional<Invoice> findById(int id) {
//        return invoiceRepository.findById(id);
//    }
//
//    public Iterable<Invoice> findAll() {
//        return invoiceRepository.findAll();
//    }
//
//    public void updateInvoice(Invoice invoice) {
//        invoiceRepository.save(invoice);
//    }
//
//    public void deleteInvoice(Invoice invoice) {
//        invoiceRepository.delete(invoice);
//    }
//
//
//
//}
