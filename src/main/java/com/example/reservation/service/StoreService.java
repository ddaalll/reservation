package com.example.reservation.service;

import com.example.reservation.exception.ResourceNotFoundException;
import com.example.reservation.model.Store;
import com.example.reservation.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store registerStore(Store store) {
        return storeRepository.save(store);
    }
    public List<Store> findAllStores() {
        return storeRepository.findAll();
    }

    public Store findStoreById(Long id) {
        return storeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Store not found"));
    }
}
