package com.booking.repository;

import com.booking.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository in the persistence layer for `Show` entities.
 * Provides CRUD access for showtimes configured by partners.
 */
@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {}
