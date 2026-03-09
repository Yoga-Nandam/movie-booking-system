package com.booking.service;

import com.booking.model.Show;

/**
 * Service layer contract for show-related use cases.
 * Defines operations for creating and managing shows decoupled from controllers and repositories.
 */
public interface ShowService {

    Show createShow(Show show);
}

