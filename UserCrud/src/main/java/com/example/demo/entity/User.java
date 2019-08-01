package com.example.demo.entity;

import javax.persistence.*;

@Entity//告诉Springboot这是实体类
public class User {
    @Id//设置主键
    private Integer id;

    private String name;
    private String password;
    private String content;
    public User(){
    }
    @Override
    public String toString(){
        return "User{"+
                "id="+id+'\n'+
                "name="+name+'\n'+
                "password="+password+'\n'+
                "content="+content+'\n'+
                "}";
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
