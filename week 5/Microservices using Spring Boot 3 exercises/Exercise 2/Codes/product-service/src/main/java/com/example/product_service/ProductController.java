package com.example.product_service;

import com.example.product_service.Product;
import com.example.product_service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }
}
