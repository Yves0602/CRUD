package com.example.demo.dao;

import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaotest {
    @Autowired
    private UserDao userDao;

    @Test
    public  void test1(){
        int excepted = 1;
        List<User> user =  userDao.findByNameAndPassword("Jim","password");
        Assert.assertEquals(excepted,user.size());
    }
}
