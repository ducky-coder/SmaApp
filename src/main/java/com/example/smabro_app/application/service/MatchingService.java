package com.example.smabro_app.application.service;

import com.example.smabro_app.domain.model.OpponentList;
import com.example.smabro_app.infrastructure.repository.MatchingRepository;
import com.example.smabro_app.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class MatchingService {

    private final MatchingRepository matchingRepository;

    private final UserRepository userRepository;

    public OpponentList.Opponent getOpponent(final int condition, final int userId) {

        int myRate = userRepository.findByUserId(userId).getRate();
        List<OpponentList.Opponent> filteredOpponentList = matchingRepository.getOpponent(myRate, userId).filterOpponentListFromCondition(condition);

        return filteredOpponentList.get(new Random().nextInt(filteredOpponentList.size()));
    }
}
