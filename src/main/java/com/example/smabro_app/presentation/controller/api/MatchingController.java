package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.application.facade.MatchingFacade;
import com.example.smabro_app.presentation.dto.response.OpponentResponse;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/Matching")
@RequiredArgsConstructor
public class MatchingController {

    private final MatchingFacade matchingFacade;

    @GetMapping("/{userId}")
    public OpponentResponse getOpponent(
            @RequestParam("condition") final int condition,
            @PathVariable("userId") final int userId
            ) {

        return matchingFacade.getOpponent(condition, userId);
    }

    @PostMapping("/{matchId}/{userId}")
    public void postStatusCode(@PathVariable("matchId") final int matchId, @PathVariable("userId") final int userId) {

        // TODO URIにユーザーIDは含めずにセッションからユーザーIDを取得するようにする

        matchingFacade.postStatusCode(matchId, userId);
    }
}
