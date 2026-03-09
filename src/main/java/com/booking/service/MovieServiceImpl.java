package com.booking.service;

import com.booking.model.Movie;
import com.booking.model.MovieRequest;
import com.booking.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer implementation of {@link MovieService}.
 * Contains the movie-related business logic and delegates persistence to {@link MovieRepository}.
 */
@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createMovie(MovieRequest request) {

        Movie movie = new Movie();
        movie.setTitle(request.getTitle());
        movie.setLanguage(request.getLanguage());
        movie.setGenre(request.getGenre());

        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> findByLanguage(String language) {
        return movieRepository.findByLanguage(language);
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }
}
