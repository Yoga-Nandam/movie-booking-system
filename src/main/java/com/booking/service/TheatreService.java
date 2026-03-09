package com.booking.service;

import com.booking.model.Theatre;

/**
 * Service layer contract for theatre-related use cases.
 * Defines operations for creating and managing theatres independent of controllers and repositories.
 */
public interface TheatreService {

    Theatre createTheatre(Theatre theatre);
}

