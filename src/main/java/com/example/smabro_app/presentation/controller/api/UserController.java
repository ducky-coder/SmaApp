package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.application.facade.UserFacade;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping("/")
    public int createUser(@RequestBody final UserRequest request) {

        return userFacade.createUser(request);
    }

    @PutMapping("/{id}")
    public int updateUser(@RequestBody final UserRequest request, @PathVariable("id") final int id) {

        return userFacade.updateUser(request, id);
    }

    @GetMapping("/{name}")
    public UserResponse findByName(@PathVariable String name) {

        return userFacade.findByName(name);
    }

    @GetMapping("/ranking")
    public List<UserResponse> getRateRanking() {

        return userFacade.getRateRanking();
    }

    // TODO 以下の実装はupdateUserと統合する
//    @PutMapping("/{id}")
//    public int updateUserMatchingStatus(@RequestParam("condition") final Integer status, @PathVariable("id") final int id) {
//
//        return userFacade.updateUserMatchingStatus(status, id);
//    }
}
