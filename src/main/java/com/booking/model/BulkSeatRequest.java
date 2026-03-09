package com.booking.model;

import java.util.List;

/**
 * Request DTO bundling multiple seat definitions for bulk creation.
 * Used by the presentation layer to create several `Seat` entities for a screen in one call.
 */
public class BulkSeatRequest {
    private Long screenId;

    private List<String> seatNumbers;

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

    public List<String> getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(List<String> seatNumbers) {
        this.seatNumbers = seatNumbers;
    }
}
