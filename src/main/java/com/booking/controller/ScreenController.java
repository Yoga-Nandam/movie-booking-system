package com.booking.controller;

import com.booking.model.Screen;
import com.booking.model.ScreenRequest;
import com.booking.service.ScreenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller in the presentation layer for screen management endpoints.
 * Uses `ScreenService` to create and query screens while keeping HTTP concerns separate from business logic.
 */
@RestController
@RequestMapping("/partner/screens")
public class ScreenController {
    private final ScreenService screenService;

    // Dependency Injection (SOLID - Dependency Inversion)
    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }

    @PostMapping
    public Screen createScreen(@RequestBody ScreenRequest request) {
        return screenService.createScreen(request);
    }

    @GetMapping("/theatre/{theatreId}")
    public List<Screen> getScreens(@PathVariable Long theatreId) {
        return screenService.getScreensByTheatre(theatreId);
    }
}
