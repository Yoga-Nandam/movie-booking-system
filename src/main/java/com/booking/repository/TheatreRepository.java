package com.booking.repository;

import com.booking.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository in the persistence layer for `Theatre` entities.
 * Provides basic CRUD access for theatres owned by partners.
 */
@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {}
