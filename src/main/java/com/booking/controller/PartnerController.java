package com.booking.controller;

import com.booking.model.Partner;
import com.booking.service.PartnerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller in the presentation layer for onboarding and managing partners.
 * Accepts partner data from HTTP requests and delegates to the `PartnerService`.
 */
@RestController
@RequestMapping("/partner")
public class PartnerController {
    private final PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        this.partnerService = partnerService;
    }

    @PostMapping
    public Partner createPartner(@RequestBody Partner partner) {
        return partnerService.createPartner(partner);
    }
}
