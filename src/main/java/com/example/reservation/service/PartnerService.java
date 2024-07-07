package com.example.reservation.service;

import com.example.reservation.model.Partner;
import com.example.reservation.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {
    @Autowired
    private PartnerRepository partnerRepository;

    public Partner registerPartner(Partner partner) {
        return partnerRepository.save(partner);
    }
}