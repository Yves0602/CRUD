package com.example.demo.controller;

import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest  {
    @Autowired
    private UserController userController;

    @Test
    @Transactional
    public void shouldPost(){
        String expect="User{id=9\n" +
                "name=noob\n" +
                "password=12341234\n" +
                "content=Ceeeeeeeeeeb\n" +
                "}";
        User user = new User();
        user.setId(9);
        user.setName("noob");
        user.setContent("Ceeeeeeeeeeb");
        user.setPassword("12341234");
        Assert.assertEquals(expect,userController.post(user).toString());

    }

    @Test
    @Transactional
    public void shouldPut(){
        String expect="User{id=1\n" +
                "name=noob\n" +
                "password=12341234\n" +
                "content=Ceeeeeeeeeeb\n" +
                "}";
        User user =new User();
        user.setId(1);
        user.setName("noob");
        user.setContent("Ceeeeeeeeeeb");
        user.setPassword("12341234");
        Assert.assertEquals(expect,userController.put(user).toString());
    }


    @Test
    @Transactional
    public void shouldDelete() {
        String expected = "删除成功";
        Assert.assertEquals(expected,userController.delete(3));
    }

    @Test
    @Transactional
    public void shouldFind1(){
        String expected="Optional[User{id=1\n" +
                "name=Jim\n" +
                "password=password\n" +
                "content=this is jim\n" +
                "}]";
        Assert.assertEquals(expected,userController.findById(1).toString());
    }

    @Test
    @Transactional
    public void shouldFind2(){
        String expected ="[User{id=1\n" +
                "name=Jim\n" +
                "password=password\n" +
                "content=this is jim\n" +
                "}]";
        Assert.assertEquals(expected,userController.findByNAndP("Jim","password").toString());
    }
}
