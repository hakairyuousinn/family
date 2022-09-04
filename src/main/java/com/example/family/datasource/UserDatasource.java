package com.example.family.datasource;

import com.example.family.domain.model.user.User;
import com.example.family.mapper.UserMapper;
import com.example.family.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDatasource implements UserRepository {

    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}
