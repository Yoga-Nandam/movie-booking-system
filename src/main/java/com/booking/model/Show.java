package com.booking.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * JPA entity representing a specific movie showtime on a screen.
 * Uses optimistic locking via `@Version` to protect concurrent updates.
 */
@Entity
public class Show {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

    private LocalDateTime showTime;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
