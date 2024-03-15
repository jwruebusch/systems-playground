package com.example.systemsplayground.controllers;

import com.example.systemsplayground.services.UserService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/usernames")
    ResponseEntity<List<String>> getUsernames() {
        return new ResponseEntity<>(userService.getUsernames(), HttpStatus.OK);
    }
}
