package com.example.reservation.controller;

import com.example.reservation.model.Reservation;
import com.example.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping("/make")
    public ResponseEntity<Reservation> makeReservation(@RequestBody Reservation reservation) {
        Reservation madeReservation = reservationService.makeReservation(reservation);
        return ResponseEntity.ok(madeReservation);
    }
}
