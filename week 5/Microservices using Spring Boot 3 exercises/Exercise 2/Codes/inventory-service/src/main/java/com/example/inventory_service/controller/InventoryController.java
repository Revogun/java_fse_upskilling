package com.example.inventory_service.controller;

import com.example.inventory_service.model.Inventory;
import com.example.inventory_service.repository.InventoryRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryRepository inventoryRepository;

    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @GetMapping("/{productCode}")
    public Integer getStock(@PathVariable String productCode) {
        return inventoryRepository.findByProductCode(productCode)
                .map(Inventory::getStock)
                .orElse(0);
    }
}
