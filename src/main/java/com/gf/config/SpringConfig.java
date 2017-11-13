package com.gf.config;

import com.gf.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.gf")
@PropertySource(value = {"classpath: application-database.properties"},ignoreResourceNotFound = true)
public class SpringConfig {

    @Bean
    public UserDao  getUserDao(){
        return new UserDao();
    }
}
