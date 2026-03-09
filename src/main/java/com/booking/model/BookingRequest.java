package com.booking.model;

import java.util.List;

/**
 * Request DTO representing a booking command from the client.
 * Carries user identity, target show and requested seat identifiers into the booking use case.
 */
public class BookingRequest {
    private String user;
    private Long showId;
    private List<Long> seatIds;

    public void setUser(String user) {
        this.user = user;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public void setSeatIds(List<Long> seatIds) {
        this.seatIds = seatIds;
    }

    public String getUser() {
        return user;
    }

    public Long getShowId() {
        return showId;
    }

    public List<Long> getSeatIds() {
        return seatIds;
    }
}
