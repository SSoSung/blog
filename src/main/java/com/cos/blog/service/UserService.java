package com.cos.blog.service;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserReposiroty userReposiroty;

    @Transactional
    public int save(User user){
        try{
            userReposiroty.save(user);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("UserService : 회원가입() : "+e.getMessage());
        }
        return -1;
    }
}
