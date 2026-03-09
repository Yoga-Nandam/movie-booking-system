package com.booking.service;

import com.booking.model.BulkSeatRequest;
import com.booking.model.Seat;
import com.booking.model.SeatRequest;

import java.util.List;

/**
 * Service layer contract for seat management operations.
 * Provides methods for creating single and bulk seats independent of web and persistence layers.
 */
public interface SeatService {
    Seat createSeat(SeatRequest request);

    List<Seat> createSeats(BulkSeatRequest request);
}
