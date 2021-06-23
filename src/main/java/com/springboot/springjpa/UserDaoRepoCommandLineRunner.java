package com.springboot.springjpa;

import com.springboot.springjpa.Entitiy.User;
import com.springboot.springjpa.Repository.UserDaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoRepoCommandLineRunner implements CommandLineRunner {
    @Autowired private UserDaoRepository userDaoRepository;

    private static final Logger log = LoggerFactory.getLogger(UserDaoRepoCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jill", "Admin");
        userDaoRepository.save(user);
        log.info("New user created: " + user);

        List<User> userList = userDaoRepository.findAll();
        log.info("Users found: ");
        log.info(userList.toString());
    }
}
