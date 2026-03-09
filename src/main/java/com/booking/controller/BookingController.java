package com.booking.controller;

import com.booking.model.Booking;
import com.booking.model.BookingRequest;
import com.booking.service.BookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller in the presentation layer for booking-related HTTP endpoints.
 * Delegates booking creation requests to the application service layer (`BookingService`).
 */
@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking book(@RequestBody BookingRequest request) {
        return bookingService.createBooking(request);
    }
}
