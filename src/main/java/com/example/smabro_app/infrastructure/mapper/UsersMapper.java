package com.example.smabro_app.infrastructure.mapper;

import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import com.example.smabro_app.infrastructure.model.response.UserResponseQuery;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Nonnull;

@Mapper
public interface UsersMapper {

    int insert(@Nonnull final UserRequestQuery record);
    UserResponseQuery findByName(@Nonnull final String name);
    UserResponseQuery findById(final int id);
    int update(@Nonnull final UserRequestQuery record);
}