package com.example.reservation.controller;

import com.example.reservation.model.Store;
import com.example.reservation.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping("/register")
    public ResponseEntity<Store> registerStore(@RequestBody Store store) {
        Store registeredStore = storeService.registerStore(store);
        return ResponseEntity.ok(registeredStore);
    }
    @GetMapping
    public ResponseEntity<List<Store>> getAllStores() {
        List<Store> stores = storeService.findAllStores();
        return ResponseEntity.ok(stores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Store> getStoreById(@PathVariable Long id) {
        Store store = storeService.findStoreById(id);
        return ResponseEntity.ok(store);
    }
}
