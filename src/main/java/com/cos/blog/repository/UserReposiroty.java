package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserReposiroty extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
