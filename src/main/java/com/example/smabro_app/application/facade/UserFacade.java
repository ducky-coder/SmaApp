package com.example.smabro_app.application.facade;

import com.example.smabro_app.application.service.UserService;
import com.example.smabro_app.domain.model.User;
import com.example.smabro_app.presentation.dto.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

@Service
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;

    private final PasswordEncoder passwordEncoder;

    public int createUser(@Nonnull final UserRequest request) {
        request.setPassword(passwordEncoder.encode(request.getPassword()));

        return userService.createUser(User.from(request));
    }

    public int updateUser(@Nonnull final UserRequest request, final int id) {

        return userService.updateUser(User.createUpdateUserRequest(request, id));
    }
}
