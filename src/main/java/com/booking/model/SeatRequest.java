package com.booking.model;

/**
 * Request DTO used by the web layer for creating a single seat.
 * Carries the minimal data required to map to the `Seat` domain entity.
 */
public class SeatRequest {
    private String seatNumber;

    private Long screenId;

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }
}
