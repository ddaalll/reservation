package com.example.reservation.controller;

import com.example.reservation.model.Partner;
import com.example.reservation.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partners")
public class PartnerController {
    @Autowired
    private PartnerService partnerService;

    @PostMapping("/register")
    public ResponseEntity<Partner> registerPartner(@RequestBody Partner partner) {
        Partner registeredPartner = partnerService.registerPartner(partner);
        return ResponseEntity.ok(registeredPartner);
    }
}