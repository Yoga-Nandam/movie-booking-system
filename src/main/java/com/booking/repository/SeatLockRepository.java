package com.booking.repository;

import com.booking.model.SeatLock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data JPA repository in the persistence layer for `SeatLock` entities.
 * Adds a finder to query locks by seat and show identifiers.
 */
@Repository
public interface SeatLockRepository extends JpaRepository<SeatLock, Long> {

    Optional<SeatLock> findBySeatIdAndShowId(Long seatId, Long showId);
}
