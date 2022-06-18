package com.example.family.domain.repository;


import com.example.family.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("FROM User ORDER BY user_id")
    public List<User> getAllUsers();
}
