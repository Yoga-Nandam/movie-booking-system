package com.booking.repository;

import com.booking.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA repository in the persistence layer for `Movie` entities.
 * Exposes CRUD operations and query methods such as language and genre filters.
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByLanguage(String language);

    List<Movie> findByGenre(String genre);
}
