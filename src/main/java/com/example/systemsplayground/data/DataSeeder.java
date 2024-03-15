package com.example.systemsplayground.data;

import com.example.systemsplayground.models.User;
import com.example.systemsplayground.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder {
    @Bean
    public CommandLineRunner initDataBase(UserRepository repository) {
        return args -> {
            repository.save(User.builder()
                .id(1)
                .firstName("John")
                .lastName("Smith")
                .username("JSMITH")
                .build());
            repository.save(User.builder()
                .id(2)
                .firstName("Sally")
                .lastName("Jones")
                .username("SJONES")
                .build());
            repository.save(User.builder()
                .id(3)
                .firstName("Freddy")
                .lastName("Mercury")
                .username("FMERCURY")
                .build());
        };
    }
}
