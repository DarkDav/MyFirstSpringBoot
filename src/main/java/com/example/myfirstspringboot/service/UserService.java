package com.example.myfirstspringboot.service;



import com.example.myfirstspringboot.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(int id);
    void change(User user);
    User getById(int id);
}
