package com.booking.service;

import com.booking.model.Seat;
import com.booking.model.Show;

import java.util.List;

/**
 * Domain service contract responsible for managing temporary seat locks.
 * Enforces seat locking rules independently of web and persistence layers.
 */
public interface SeatLockService {

    void lockSeats(List<Seat> seats, Show show, String user);
}
