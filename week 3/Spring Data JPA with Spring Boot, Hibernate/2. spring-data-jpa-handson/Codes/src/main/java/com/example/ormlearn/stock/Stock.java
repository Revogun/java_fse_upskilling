package com.example.ormlearn.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "stock")
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id")
    private int id;

    @Column(name = "st_code")
    private String code;

    @Column(name = "st_date")
    private LocalDate date;

    @Column(name = "st_open")
    private BigDecimal open;

    @Column(name = "st_close")
    private BigDecimal close;

    @Column(name = "st_volume")
    private long volume;
}