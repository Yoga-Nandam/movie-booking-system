package com.booking.repository;

import com.booking.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository in the persistence layer for `Partner` entities.
 * Provides CRUD access for partner records.
 */
@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
