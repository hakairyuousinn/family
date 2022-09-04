package com.example.family.mapper;

import com.example.family.domain.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    void save(User user);
}
