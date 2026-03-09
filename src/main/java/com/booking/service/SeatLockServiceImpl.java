package com.booking.service;

import com.booking.model.Seat;
import com.booking.model.SeatLock;
import com.booking.model.Show;
import com.booking.repository.SeatLockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Domain service implementation responsible for managing temporary seat locks.
 * Enforces seat locking rules and uses {@link SeatLockRepository} to persist lock state within a transaction.
 */
@Service
public class SeatLockServiceImpl implements SeatLockService {

    private final SeatLockRepository seatLockRepository;

    public SeatLockServiceImpl(SeatLockRepository seatLockRepository) {
        this.seatLockRepository = seatLockRepository;
    }

    @Override
    @Transactional
    public void lockSeats(List<Seat> seats, Show show, String user) {

        for (Seat seat : seats) {

            Optional<SeatLock> lock =
                    seatLockRepository.findBySeatIdAndShowId(seat.getId(), show.getId());

            if (lock.isPresent() &&
                    lock.get().getExpiryTime().isAfter(LocalDateTime.now())) {

                throw new RuntimeException("Seat already locked");
            }

            SeatLock newLock = new SeatLock();
            newLock.setSeat(seat);
            newLock.setShow(show);
            newLock.setLockedBy(user);
            newLock.setLockTime(LocalDateTime.now());
            newLock.setExpiryTime(LocalDateTime.now().plusMinutes(5));

            seatLockRepository.save(newLock);
        }
    }
}

