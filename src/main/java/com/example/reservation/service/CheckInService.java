package com.example.reservation.service;

import com.example.reservation.model.CheckIn;
import com.example.reservation.repository.CheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInService {
    @Autowired
    private CheckInRepository checkInRepository;

    public CheckIn confirmCheckIn(CheckIn checkIn) {
        return checkInRepository.save(checkIn);
    }
}