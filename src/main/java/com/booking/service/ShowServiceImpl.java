package com.booking.service;

import com.booking.model.Show;
import com.booking.repository.ShowRepository;
import org.springframework.stereotype.Service;

/**
 * Service layer implementation of {@link ShowService}.
 * Encapsulates show-related business logic and delegates persistence to {@link ShowRepository}.
 */
@Service
public class ShowServiceImpl implements ShowService {

    private final ShowRepository showRepository;

    public ShowServiceImpl(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    @Override
    public Show createShow(Show show) {
        return showRepository.save(show);
    }
}

