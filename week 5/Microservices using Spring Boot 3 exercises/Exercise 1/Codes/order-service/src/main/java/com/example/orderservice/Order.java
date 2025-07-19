package com.example.orderservice;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders") // <-- fix here
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    @Column(name = "user_id")
    private Long userId;
}
