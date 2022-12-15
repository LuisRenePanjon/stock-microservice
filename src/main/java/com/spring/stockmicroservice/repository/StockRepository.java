package com.spring.stockmicroservice.repository;

import com.spring.stockmicroservice.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository extends JpaRepository<StockEntity, String> {

    Optional<StockEntity> findByCode(String code);

}
