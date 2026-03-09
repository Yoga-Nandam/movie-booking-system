package com.booking.repository;

import com.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository in the persistence layer for `Booking` entities.
 * Provides CRUD operations and query abstraction for bookings.
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {}
