package com.example.family.repository;


import com.example.family.domain.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    void save(User user);
}
