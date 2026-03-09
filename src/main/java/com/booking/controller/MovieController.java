package com.booking.controller;

import com.booking.model.Movie;
import com.booking.model.MovieRequest;
import com.booking.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller in the presentation layer for movie catalog operations.
 * Delegates all movie-related actions to the `MovieService` while exposing HTTP endpoints.
 */
@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Movie createMovie(@RequestBody MovieRequest request) {
        return movieService.createMovie(request);
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/language/{language}")
    public List<Movie> byLanguage(@PathVariable String language) {
        return movieService.findByLanguage(language);
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> byGenre(@PathVariable String genre) {
        return movieService.findByGenre(genre);
    }
}
