package com.booking.model;

public class BookingEvent {
    private String bookingId;
    private String userId;
    private String movieName;

    public BookingEvent(String bookingId, String userId, String movieName) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.movieName = movieName;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public String getMovieName() {
        return movieName;
    }
}
