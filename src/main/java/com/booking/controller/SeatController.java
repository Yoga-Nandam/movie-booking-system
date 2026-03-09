package com.booking.controller;

import com.booking.model.BulkSeatRequest;
import com.booking.model.Seat;
import com.booking.model.SeatRequest;
import com.booking.service.SeatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller in the presentation layer for managing seats exposed to partners.
 * Accepts seat-related requests and delegates creation logic to the `SeatService`.
 */
@RestController
@RequestMapping("/partner/seats")
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @PostMapping
    public Seat createSeat(@RequestBody SeatRequest request) {
        return seatService.createSeat(request);
    }

    @PostMapping("/bulk")
    public List<Seat> createSeats(@RequestBody BulkSeatRequest request) {
        return seatService.createSeats(request);
    }
}
