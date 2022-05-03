package com.example.myfirstspringboot.service;


import com.example.myfirstspringboot.dao.UserDAO;
import com.example.myfirstspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override

    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override

    public void change(User user) {
        userDAO.change(user);
    }

    @Override

    public User getById(int id) {
        return userDAO.getById(id);
    }
}
