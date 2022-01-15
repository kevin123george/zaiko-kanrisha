package com.hatake.zaikokanrisha.controller;

import com.hatake.zaikokanrisha.models.Stock;
//import com.hatake.zaikokanrisha.models.TheLogConverter;
import com.hatake.zaikokanrisha.service.StockLogService;
import com.hatake.zaikokanrisha.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockService stockService;
    @Autowired
    private StockLogService stockLogService;

    @RequestMapping("")
    public Iterable<Stock> getAllStock() {
        return stockService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Stock> searchStock(@PathVariable int id) {
        return stockService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addStock(@RequestBody Stock stock) {
        stockService.insert(stock);
//        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateStock(@RequestBody Stock stock) {
        stockService.updateStock(stock);
//        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteStock(@RequestBody Stock stock) {
        stockService.deleteStock(stock);
//        stockLogService.insert(TheLogConverter.stockLogConverter(stock));
    }

}
