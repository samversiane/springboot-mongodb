package com.sam.workshopmongo.config;

import com.sam.workshopmongo.domain.User;
import com.sam.workshopmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        userRepository.saveAll(
                Arrays.asList(new User(null, "Maria Brow", "maria@email.com"),
                        new User(null, "ALex Green", "alex@email.com"),
                        new User(null, "Bob Grey", "bob@email.com")));
    }
}



