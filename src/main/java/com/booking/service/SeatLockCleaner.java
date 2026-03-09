package com.booking.service;

import com.booking.model.SeatLock;
import com.booking.repository.SeatLockRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Infrastructure component responsible for periodically cleaning up expired seat locks.
 * Runs on a schedule to keep the persistence layer free from stale `SeatLock` records.
 */
@Component
public class SeatLockCleaner {
    private final SeatLockRepository seatLockRepository;

    public SeatLockCleaner(SeatLockRepository seatLockRepository) {
        this.seatLockRepository = seatLockRepository;
    }

    @Scheduled(fixedRate = 60000)
    public void cleanLocks() {

        List<SeatLock> locks = seatLockRepository.findAll();

        locks.stream()
                .filter(lock -> lock.getExpiryTime().isBefore(LocalDateTime.now()))
                .forEach(seatLockRepository::delete);
    }
}
