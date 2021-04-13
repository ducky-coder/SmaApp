package com.example.smabro_app.infrastructure.mapper;

import com.example.smabro_app.infrastructure.model.request.UserRequestQuery;
import com.example.smabro_app.infrastructure.model.response.UserResponseQuery;
import com.example.smabro_app.security.UserAccount;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Nonnull;

@Mapper
public interface UsersMapper {

    int insert(@Nonnull final UserRequestQuery record);
    UserAccount findByName(@Nonnull final String name);
    UserResponseQuery findById(final int id);
    int update(@Nonnull final UserRequestQuery record);
    int updateUserMatchingStatus(Integer status, int id);
}