package com.varun.demo.restful.restfulwebservice.controller.helloworld.user;

import com.varun.demo.restful.restfulwebservice.bean.user.Users;
import com.varun.demo.restful.restfulwebservice.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/api/v1/users")
    public List<Users> getUsers(){
        return userDao.getUsers();
    }

    @GetMapping("/api/v1/users/{id}")
    public Users getUserId(@PathVariable int id){
        return userDao.getUserById(id);
    }

    @PostMapping("/api/v1/users/save")
    public Users saveUsers(@RequestBody Users users){
        return userDao.saveUser(users);
    }
}
