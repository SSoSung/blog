package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

    private String id;
    private String username;
    private String password;
    private String email;
}
