package com.mu.demo.dao;

import com.mu.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 描述: </br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/12/5 15:06
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@Mapper
public interface UserDao {

    @Select("select * from user")
    public List<User> getAllUsers();

}
