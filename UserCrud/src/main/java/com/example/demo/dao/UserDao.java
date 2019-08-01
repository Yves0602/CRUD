package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserDao extends JpaRepository<User,Integer> {
    //定义通过user和passwor查找
    @Query(value="select * from user where name=:name and password=:password",nativeQuery = true)
    List<User> findByNameAndPassword(@Param("name") String name,@Param("password") String password);
}
