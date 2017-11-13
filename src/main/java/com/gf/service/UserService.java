package com.gf.service;

import com.gf.dao.UserDao;
import com.gf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
   @Autowired
   private UserDao userDao;
   public List<User> getUser(){
       return userDao.getUser();
   }

}
