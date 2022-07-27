package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;


@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest(Member m){
        return "get 요청"+m.getId();
    }

    @PostMapping("/http/post")
    public String postTest(@RequestBody Member m){
        return "post 요청"+m.getId();
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
