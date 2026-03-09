package com.booking.service;

import com.booking.model.Screen;
import com.booking.model.ScreenRequest;

import java.util.List;

/**
 * Service layer contract for screen-related use cases.
 * Defines creation and query operations for screens independent of controllers and repositories.
 */
public interface ScreenService {
    Screen createScreen(ScreenRequest request);

    List<Screen> getScreensByTheatre(Long theatreId);
}
