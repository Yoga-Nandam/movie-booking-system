package com.booking.service;

import com.booking.exception.ResourceNotFoundException;
import com.booking.model.Screen;
import com.booking.model.ScreenRequest;
import com.booking.model.Theatre;
import com.booking.repository.ScreenRepository;
import com.booking.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer implementation of `ScreenService`.
 * Applies screen creation rules and delegates persistence to the `ScreenRepository` and `TheatreRepository`.
 */
@Service
public class ScreenServiceImpl implements ScreenService{
    private final ScreenRepository screenRepository;
    private final TheatreRepository theatreRepository;

    public ScreenServiceImpl(ScreenRepository screenRepository,
                             TheatreRepository theatreRepository) {
        this.screenRepository = screenRepository;
        this.theatreRepository = theatreRepository;
    }

    @Override
    public Screen createScreen(ScreenRequest request) {

        Theatre theatre = theatreRepository.findById(request.getTheatreId())
                .orElseThrow(() -> new ResourceNotFoundException("Theatre not found"));

        Screen screen = new Screen();
        screen.setName(request.getName());
        screen.setTotalSeats(request.getTotalSeats());
        screen.setTheatre(theatre);

        return screenRepository.save(screen);
    }

    @Override
    public List<Screen> getScreensByTheatre(Long theatreId) {
        return screenRepository.findByTheatreId(theatreId);
    }
}
