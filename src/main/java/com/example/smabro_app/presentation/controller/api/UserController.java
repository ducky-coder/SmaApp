package com.example.smabro_app.presentation.controller.api;

import com.example.smabro_app.application.facade.UserFacade;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping("/")
    public int createUser(@RequestBody final UserRequest request) {

        return userFacade.createUser(request);
    }

    @GetMapping("/")
    public UserResponse findByUserName(@RequestParam("name") final String name) {

        return userFacade.findByUserName(name);
    }

    @PutMapping("/{id}")
    public int updateUser(@RequestBody final UserRequest request, @PathVariable("id") final int id) {

        return userFacade.updateUser(request, id);
    }
}
