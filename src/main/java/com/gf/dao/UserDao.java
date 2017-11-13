package com.gf.dao;

import com.gf.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserDao {
    public List<User> getUser(){
        ArrayList<User> list = new ArrayList<User>();
        User user = new User();
        user.setUserName("张三");
        user.setPassword("123456");
        list.add(user);
        return list;
    }
}
