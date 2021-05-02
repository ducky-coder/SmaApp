package com.example.smabro_app.presentation.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MatchingRequest {

    private Integer userId;

    private Integer opponentId;

    private Integer statusCode;
}
