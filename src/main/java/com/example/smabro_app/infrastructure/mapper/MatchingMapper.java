package com.example.smabro_app.infrastructure.mapper;

import com.example.smabro_app.infrastructure.model.response.OpponentResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MatchingMapper {

    List<OpponentResponse> getOpponent(final int id);
}
