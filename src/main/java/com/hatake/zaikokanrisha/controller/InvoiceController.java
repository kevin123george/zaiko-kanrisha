//package com.hatake.zaikokanrisha.controller;
//
//
//import com.hatake.zaikokanrisha.models.Invoice;
//import com.hatake.zaikokanrisha.service.InvoiceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/invoices")
//public class InvoiceController {
//
//    @Autowired
//    private InvoiceService invoiceService;
//
//    @RequestMapping("")
//    public Iterable<Invoice> getAllInvoice() {
//        return invoiceService.findAll();
//    }
//
//    @RequestMapping("/{id}")
//    public Optional<Invoice> searchInvoice(@PathVariable Integer id) {
//        return invoiceService.findById(id);
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "")
//    public void addInvoice(@RequestBody Invoice invoice) {
//        invoiceService.insert(invoice);
//    }
//
//    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
//    public void updateInvoice(@RequestBody Invoice invoice) {
//        invoiceService.updateInvoice(invoice);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
//    public void deleteInvoice(@RequestBody Invoice invoice) {
//        invoiceService.deleteInvoice(invoice);
//    }
//
//}
