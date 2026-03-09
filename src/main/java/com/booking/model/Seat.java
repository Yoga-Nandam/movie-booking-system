package com.booking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * JPA entity representing a physical seat within a screen.
 * Part of the domain model and persisted via the `SeatRepository`.
 */
@Entity
public class Seat {
    @Id
    @GeneratedValue
    private Long id;

    private String seatNumber;

    @ManyToOne
    private Screen screen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
