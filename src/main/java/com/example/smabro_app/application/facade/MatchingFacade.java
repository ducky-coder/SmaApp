package com.example.smabro_app.application.facade;

import com.example.smabro_app.application.service.MatchingService;
import com.example.smabro_app.presentation.dto.response.OpponentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchingFacade {

    private final MatchingService matchingService;

    public OpponentResponse getOpponent(final int condition, final int userId) {

        return OpponentResponse.from(matchingService.getOpponent(condition, userId));
    }
}
