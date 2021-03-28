package com.example.smabro_app.application.service;

import com.example.smabro_app.domain.model.User;
import com.example.smabro_app.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public int createUser(@Nonnull final User request) {

        return userRepository.createUser(request);
    }

    public User findByUserName(@Nonnull final String name) {

        return userRepository.findByUserName(name);
    }

    public int updateUser(@Nonnull final User request) {

        return userRepository.updateUser(request);
    }
}
