package com.example.smabro_app.infrastructure.repository;

import com.example.smabro_app.domain.model.OpponentList;
import com.example.smabro_app.infrastructure.mapper.MatchingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MatchingRepository {

    private final MatchingMapper matchingMapper;

    public OpponentList getOpponent(final int myRate, final int userId) {

        return OpponentList.from(matchingMapper.getOpponent(userId), myRate);
    }
}
