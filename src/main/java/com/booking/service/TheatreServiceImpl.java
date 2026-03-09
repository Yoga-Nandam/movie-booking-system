package com.booking.service;

import com.booking.model.Theatre;
import com.booking.repository.TheatreRepository;
import org.springframework.stereotype.Service;

/**
 * Service layer implementation of {@link TheatreService}.
 * Encapsulates theatre-related business logic and delegates persistence to {@link TheatreRepository}.
 */
@Service
public class TheatreServiceImpl implements TheatreService {

    private final TheatreRepository theatreRepository;

    public TheatreServiceImpl(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    @Override
    public Theatre createTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }
}

