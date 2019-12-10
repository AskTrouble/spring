package com.mu.demo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageRowBounds;
import com.mu.demo.dao.db1.TUserDao;
import com.mu.demo.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@EnableAutoConfiguration
public class TUserController {

    @Autowired
    private TUserDao userDao;

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody TUser student) {
        userDao.addTUser(student);
    }

    @RequestMapping(value = "/getAllTUsers")
    public List<TUser> getAllTUsers(){
        return userDao.getAllTUsers();
    }

    @RequestMapping(value = "/getPage")
    public Page<TUser> getPage(){
        return userDao.getPage(new PageRowBounds(0, 2));
    }

    @RequestMapping(value = "/getPageSize")
    public Page<TUser> getPageSize(){
        return userDao.getPageSize(1,2);
    }
}