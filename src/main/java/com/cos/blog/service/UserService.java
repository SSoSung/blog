package com.cos.blog.service;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserReposiroty userReposiroty;

    @Transactional
    public void 회원가입(User user){
        userReposiroty.save(user);
    }

    @Transactional(readOnly = true)
    public User 로그인(User user){
        return userReposiroty.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
