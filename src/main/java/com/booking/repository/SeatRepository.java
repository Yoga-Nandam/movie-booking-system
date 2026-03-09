package com.booking.repository;

import com.booking.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository in the persistence layer for `Seat` entities.
 * Provides CRUD access for seats associated with screens.
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {}
