package com.booking.service;

import com.booking.model.Booking;
import com.booking.model.BookingRequest;

/**
 * Service layer contract for booking-related use cases.
 * Defines operations for creating and managing bookings independent of web and persistence layers.
 */
public interface BookingService {

    Booking createBooking(BookingRequest request);
}
