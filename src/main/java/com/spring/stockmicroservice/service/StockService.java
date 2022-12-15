package com.spring.stockmicroservice.service;

import com.spring.stockmicroservice.entity.StockEntity;
import com.spring.stockmicroservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StockService implements IStockService {

    private final StockRepository stockRepository;


    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public boolean checkStock(String code) {
        var stock =  stockRepository.findByCode(code);
        stock.orElseThrow(() -> new RuntimeException("Stock not found with code: " + code));

        return stock.get().getQuantity() > 0;
    }
}
