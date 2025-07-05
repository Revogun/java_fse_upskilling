package com.example.ormlearn.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ormlearn.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByCodeAndDateBetween(String code, LocalDate startDate, LocalDate endDate);

    List<Stock> findByCodeAndCloseGreaterThan(String code, BigDecimal price);

    List<Stock> findTop3ByOrderByVolumeDesc();

    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}
