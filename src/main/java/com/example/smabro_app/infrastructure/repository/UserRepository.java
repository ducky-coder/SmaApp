package com.example.smabro_app.infrastructure.repository;

import com.example.smabro_app.domain.model.User;
import com.example.smabro_app.infrastructure.mapper.UsersMapper;
import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final UsersMapper userMapper;

    public int createUser(@Nonnull final User request) {

        return userMapper.insert(UserRequestQuery.from(request));
    }

    public User findByUserName(@Nonnull final String name) {

        return User.from(userMapper.findByName(name));
    }

    public User findByUserId(final int id) {

        return User.from(userMapper.findById(id));
    }

    public int updateUser(@Nonnull final User request) {

        return userMapper.update(UserRequestQuery.createUpdateUserRequest(request));
    }
}
