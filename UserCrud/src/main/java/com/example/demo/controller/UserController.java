package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    //post请求
    @PostMapping("/post")
    public User post(User user){
        return userService.post(user);
    }

    //put请求
    @PutMapping("/put")
    public User put(User user){
        return  userService.put(user);
    }
    //delete请求
    @GetMapping("/delete/{id}")
    public String  delete(@PathVariable Integer id){
        userService.delete(id);
        return "删除成功";
    }

    @GetMapping("/findByID/{id}")
    public Optional<User> findById(@PathVariable Integer id){
        return userService.findById(id);

    }

    @GetMapping("/findByN&P/{name},{password}")
    public List<User> findByNAndP(@PathVariable String name,@PathVariable String password){
        return  userService.findByNameAndPassword(name,password);
    }
    @GetMapping("/list")
    public List<User> list(){
        return userService.findAll();
    }
}
