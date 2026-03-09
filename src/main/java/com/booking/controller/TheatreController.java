package com.booking.controller;

import com.booking.model.Theatre;
import com.booking.service.TheatreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller in the presentation layer for theatre management endpoints.
 * Handles partner theatre creation requests and delegates to the `TheatreService`.
 */
@RestController
@RequestMapping("/partner/theatres")
public class TheatreController {
    private final TheatreService theatreService;

    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @PostMapping
    public Theatre create(@RequestBody Theatre theatre) {
        return theatreService.createTheatre(theatre);
    }
}
