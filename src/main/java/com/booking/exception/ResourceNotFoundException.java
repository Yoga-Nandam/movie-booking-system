package com.booking.exception;

/**
 * Domain-level exception to indicate that a requested resource was not found.
 * This is mapped to a 404 HTTP response by the global exception handler.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

