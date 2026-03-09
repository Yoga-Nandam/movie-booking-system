package com.booking.service;

import com.booking.exception.ResourceNotFoundException;
import com.booking.model.BulkSeatRequest;
import com.booking.model.Screen;
import com.booking.model.Seat;
import com.booking.model.SeatRequest;
import com.booking.repository.ScreenRepository;
import com.booking.repository.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer implementation of `SeatService`.
 * Encapsulates seat creation rules and delegates persistence to `SeatRepository` and `ScreenRepository`.
 */
@Service
public class SeatServiceImpl implements SeatService {

    private final SeatRepository seatRepository;
    private final ScreenRepository screenRepository;

    public SeatServiceImpl(SeatRepository seatRepository,
                           ScreenRepository screenRepository) {
        this.seatRepository = seatRepository;
        this.screenRepository = screenRepository;
    }

    @Override
    public Seat createSeat(SeatRequest request) {

        Screen screen = screenRepository.findById(request.getScreenId())
                .orElseThrow(() -> new ResourceNotFoundException("Screen not found"));

        Seat seat = new Seat();
        seat.setSeatNumber(request.getSeatNumber());
        seat.setScreen(screen);

        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> createSeats(BulkSeatRequest request) {

        Screen screen = screenRepository.findById(request.getScreenId())
                .orElseThrow(() -> new ResourceNotFoundException("Screen not found"));

        List<Seat> seats = request.getSeatNumbers()
                .stream()
                .map(seatNumber -> {
                    Seat seat = new Seat();
                    seat.setSeatNumber(seatNumber);
                    seat.setScreen(screen);
                    return seat;
                })
                .toList();

        return seatRepository.saveAll(seats);
    }
}
