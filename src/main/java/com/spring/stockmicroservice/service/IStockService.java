package com.spring.stockmicroservice.service;

import com.spring.stockmicroservice.entity.StockEntity;

import java.util.Optional;

public interface IStockService {

    boolean checkStock(String code);
}
