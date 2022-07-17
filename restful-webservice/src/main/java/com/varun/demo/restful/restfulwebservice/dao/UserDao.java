package com.varun.demo.restful.restfulwebservice.dao;

import com.varun.demo.restful.restfulwebservice.bean.user.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDao {

    private static int userCounter = 4;

    private static List<Users> user = new ArrayList<>();
    static {
        user.add(new Users(1,"Varun", new Date()));
        user.add(new Users(2,"Ashish", new Date()));
        user.add(new Users(3,"Maky", new Date()));
        user.add(new Users(4,"Amol", new Date()));
    }
    public List<Users> getUsers(){
        return user;

    }

    public Users saveUser(Users users){
        if(users.getId()==null){
            users.setId(++userCounter);
        }
        user.add(users);
        return users;
    }
    public Users getUserById(int id){
        for(Users user : user){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }
}
