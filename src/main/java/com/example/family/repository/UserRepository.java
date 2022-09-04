package com.example.family.repository;


import com.example.family.domain.model.user.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    void save(User user);
}
