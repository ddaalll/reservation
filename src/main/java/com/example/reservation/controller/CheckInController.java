package com.example.reservation.controller;

import com.example.reservation.model.CheckIn;
import com.example.reservation.service.CheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checkins")
public class CheckInController {
    @Autowired
    private CheckInService checkInService;

    @PostMapping("/confirm")
    public ResponseEntity<CheckIn> confirmCheckIn(@RequestBody CheckIn checkIn) {
        CheckIn confirmedCheckIn = checkInService.confirmCheckIn(checkIn);
        return ResponseEntity.ok(confirmedCheckIn);
    }

}