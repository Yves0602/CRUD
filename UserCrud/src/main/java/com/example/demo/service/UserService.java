package com.example.demo.service;


import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Integer id);
    List<User> findByNameAndPassword(String name, String password);
    List<User> findAll();
    void delete(Integer id);
    User post(User user);
    User put(User user);
}
