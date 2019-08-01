package com.example.demo.service.IMPL;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User post(User user){
        return userDao.save(user);
    }

    @Override
    public void delete(Integer id){
        userDao.deleteById(id);
    }
    @Override
    public User put(User user){
        return  userDao.save(user);
    }


    @Override
    public Optional<User> findById(Integer id){
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }
    @Override
    public List<User> findByNameAndPassword(String name,String password){
        return userDao.findByNameAndPassword(name,password);
    }


}
