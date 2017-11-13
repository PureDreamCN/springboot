package com.gf;

import com.gf.config.SpringConfig;
import com.gf.model.User;
import com.gf.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static  void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        List<User> list = userService.getUser();

        System.out.println(list.get(0).getUserName()+"  "+list.get(0).getPassword());
        context.destroy();
    }
}
