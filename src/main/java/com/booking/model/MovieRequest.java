package com.booking.model;

/**
 * Request DTO used by the web layer for movie creation.
 * Decouples incoming HTTP payloads from the `Movie` JPA entity.
 */
public class MovieRequest {
    private String title;

    private String language;

    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
