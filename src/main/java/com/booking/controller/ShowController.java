package com.booking.controller;

import com.booking.model.Show;
import com.booking.service.ShowService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller in the presentation layer for managing show definitions for partners.
 * Delegates show creation requests to the `ShowService`.
 */
@RestController
@RequestMapping("/partner/shows")
public class ShowController {
    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @PostMapping
    public Show createShow(@RequestBody Show show) {
        return showService.createShow(show);
    }
}
