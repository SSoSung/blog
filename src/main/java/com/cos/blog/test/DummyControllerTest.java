package com.cos.blog.test;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserReposiroty userReposiroty;

    @GetMapping("/dummy/users")
    public List<User> list(){
        return userReposiroty.findAll();
    }

    // 한페이지당 2건에 데이터를 리턴
    @GetMapping("/dummy/user")
    public List<User> pageList(@PageableDefault(size = 2, sort = "id", direction = Sort.Direction.DESC) Pageable pageable){
       Page<User> pagingUser = userReposiroty.findAll(pageable);

       List<User> users = pagingUser.getContent();
       return users;
    }

    @GetMapping("dummy/user/{id}")
    public User detail(@PathVariable int id){

        User user = userReposiroty.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당 유저는 없습니다. id : "+id);
            }
        });
        return user;
    }

    @PostMapping("/dummy/join")
    public String join(User user){

        user.setRole(RoleType.USER);
        userReposiroty.save(user);
        return "회원가입이 완료되었습니다.";
    }
}
