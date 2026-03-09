package com.booking.service;

import com.booking.kafka.BookingEventProducer;
import com.booking.model.*;
import com.booking.repository.BookingRepository;
import com.booking.repository.SeatRepository;
import com.booking.repository.ShowRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Service layer implementation of {@link BookingService}.
 * Coordinates seat availability, seat locking and persistence while enforcing transactional consistency.
 */
@Service
public class BookingServiceImpl implements BookingService {

    private final SeatRepository seatRepository;
    private final ShowRepository showRepository;
    private final BookingRepository bookingRepository;
    private final SeatLockService seatLockService;
    private final BookingEventProducer bookingEventProducer;

    public BookingServiceImpl(SeatRepository seatRepository,
                              ShowRepository showRepository,
                              BookingRepository bookingRepository,
                              SeatLockService seatLockService, BookingEventProducer bookingEventProducer) {
        this.seatRepository = seatRepository;
        this.showRepository = showRepository;
        this.bookingRepository = bookingRepository;
        this.seatLockService = seatLockService;
        this.bookingEventProducer = bookingEventProducer;
    }

    @Override
    @Transactional
    public Booking createBooking(BookingRequest request) {

        Show show = showRepository.findById(request.getShowId())
                .orElseThrow();

        List<Seat> seats = seatRepository.findAllById(request.getSeatIds());

        seatLockService.lockSeats(seats, show, request.getUser());

        Booking booking = new Booking();
        var bookingId = UUID.randomUUID().toString();
        booking.setUserName(request.getUser());
        booking.setShow(show);
        booking.setBookingTime(LocalDateTime.now());

        var response = bookingRepository.save(booking);

        if (response.getId() != null) {
            BookingEvent event = new BookingEvent(bookingId, request.getUser(), "test");
            bookingEventProducer.sendBookingEvent(event);
        }

        return response;
    }
}

