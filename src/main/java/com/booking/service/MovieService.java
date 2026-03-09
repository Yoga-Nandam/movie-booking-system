package com.booking.service;

import com.booking.model.Movie;
import com.booking.model.MovieRequest;

import java.util.List;

/**
 * Service layer contract for movie-related use cases.
 * Defines operations for creating and querying movies independent of transport and persistence details.
 */
public interface MovieService {

    Movie createMovie(MovieRequest request);

    List<Movie> getAllMovies();

    List<Movie> findByLanguage(String language);

    List<Movie> findByGenre(String genre);
}
