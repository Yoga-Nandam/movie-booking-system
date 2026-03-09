package com.booking.repository;

import com.booking.model.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository in the persistence layer for `Screen` entities.
 * Adds a finder method to query screens by their owning theatre.
 */
@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {
    List<Screen> findByTheatreId(Long theatreId);
}
