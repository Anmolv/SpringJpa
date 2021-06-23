package com.springboot.springjpa;

import com.springboot.springjpa.Entitiy.User;
import com.springboot.springjpa.Service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        userDAOService.insert(user);
        log.info("New user created: " + user);
    }
}
