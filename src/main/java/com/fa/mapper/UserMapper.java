package com.fa.mapper;

import com.fa.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUserById(@Param("user") User user);
}