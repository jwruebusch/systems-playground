package com.example.systemsplayground.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
@Entity
@Table(name = "\"user\"")
public class User {
    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String firstName;
    String lastName;
    String username;
}
