package com.example.smabro_app.application.facade;

import com.example.smabro_app.application.service.UserService;
import com.example.smabro_app.domain.model.User;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import com.example.smabro_app.presentation.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

@Service
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;

    public int createUser(@Nonnull final UserRequest request) {

        return userService.createUser(User.from(request));
    }

    public UserResponse findByUserName(@Nonnull final String name) {

        return UserResponse.from(userService.findByUserName(name));
    }

    public int updateUser(@Nonnull final UserRequest request, final int id) {

        return userService.updateUser(User.createUpdateUserRequest(request, id));
    }
}
