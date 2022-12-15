package com.spring.stockmicroservice.controller;

import com.spring.stockmicroservice.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    private final IStockService stockService;

    @Autowired
    public StockController(IStockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/{code}")
    public boolean checkStock(@PathVariable String code){
        return this.stockService.checkStock(code);
    }
}
