package com.booking.service;

import com.booking.model.Partner;
import com.booking.repository.PartnerRepository;
import org.springframework.stereotype.Service;

/**
 * Service layer implementation of {@link PartnerService}.
 * Encapsulates partner-related business logic and delegates persistence to {@link PartnerRepository}.
 */
@Service
public class PartnerServiceImpl implements PartnerService {

    private final PartnerRepository partnerRepository;

    public PartnerServiceImpl(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @Override
    public Partner createPartner(Partner partner) {
        return partnerRepository.save(partner);
    }
}

