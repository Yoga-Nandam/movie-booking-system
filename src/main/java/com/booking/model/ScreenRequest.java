package com.booking.model;

/**
 * Request DTO used by the web layer to create screens.
 * Transports screen creation data without exposing the `Screen` JPA entity directly.
 */
public class ScreenRequest {
    private String name;

    private int totalSeats;

    private Long theatreId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Long theatreId) {
        this.theatreId = theatreId;
    }
}
