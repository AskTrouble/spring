package com.mu.demo.service.impl;

import com.mu.demo.dao.spring.UserDao;
import com.mu.demo.model.User;
import com.mu.demo.service.UserService;
import com.mu.demo.vo.CodeMsg;
import com.mu.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public ResultVo getAllUsers() {
        List<User> allUsers = userDao.getAllUsers();
        if (allUsers.size() == 0) {
            return ResultVo.error(CodeMsg.SELECT_ERROR);
        } else {
            return ResultVo.success(allUsers);
        }
    }
}