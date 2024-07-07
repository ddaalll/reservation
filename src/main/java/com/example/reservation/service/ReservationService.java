package com.example.reservation.service;

import com.example.reservation.model.Reservation;
import com.example.reservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
