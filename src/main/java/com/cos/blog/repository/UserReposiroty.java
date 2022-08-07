package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiroty extends JpaRepository<User, Integer> {

    // JPA Naming 쿼리
    User findByUsernameAndPassword(String username, String password);
}
