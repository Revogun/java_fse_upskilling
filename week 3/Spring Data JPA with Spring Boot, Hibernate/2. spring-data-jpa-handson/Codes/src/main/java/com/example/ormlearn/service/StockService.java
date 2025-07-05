package com.example.ormlearn.service;

import com.example.ormlearn.model.Stock;
import com.example.ormlearn.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class StockService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StockService.class);

    @Autowired
    private StockRepository stockRepository;
@Autowired
private EmployeeService employeeService;

@Autowired
private DepartmentService departmentService;

    public void getFacebookStockInSeptember2019() {
        LocalDate start = LocalDate.of(2019, 9, 1);
        LocalDate end = LocalDate.of(2019, 9, 30);
        List<Stock> stocks = stockRepository.findByCodeAndDateBetween("FB", start, end);
        stocks.forEach(s -> LOGGER.info("{}", s));
    }

    public void getGoogleStocksAbove1250() {
        List<Stock> stocks = stockRepository.findByCodeAndCloseGreaterThan("GOOGL", new BigDecimal("1250"));
        stocks.forEach(s -> LOGGER.info("{}", s));
    }

    public void getTop3HighVolumeStocks() {
        List<Stock> stocks = stockRepository.findTop3ByOrderByVolumeDesc();
        stocks.forEach(s -> LOGGER.info("{}", s));
    }

    public void getLowest3NetflixStocks() {
        List<Stock> stocks = stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
        stocks.forEach(s -> LOGGER.info("{}", s));
    }
}
