package com.example.systemsplayground.services;

import com.example.systemsplayground.models.User;
import com.example.systemsplayground.repositories.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getUsernames() {
        return this.userRepository.findAll()
            .stream()
            .map(User::getUsername)
            .collect(Collectors.toList());
    }
}
