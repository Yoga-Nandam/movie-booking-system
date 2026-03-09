package com.booking.service;

import com.booking.model.Partner;

/**
 * Service layer contract for partner-related use cases.
 * Defines operations for creating and managing partners independent of web and persistence layers.
 */
public interface PartnerService {

    Partner createPartner(Partner partner);
}

