package com.mu.demo.dao.spring;

import com.mu.demo.model.User;
import org.apache.ibatis.annotations.*;

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

    /**
     * 用户数据新增
     */
    @Insert("insert into user(username,password,patternLock) values (#{username},#{password},#{patternLock})")
    void addUser(User user);

    /**
     * 用户数据修改
     */
    @Update("update user set username=#{username} where id=#{id}")
    void updateUser(User user);

    /**
     * 用户数据删除
     */
    @Delete("delete from user where id=#{id}")
    void deleteUser(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT * FROM user where name=#{username}")
    User findByName(@Param("username") String username);


    @Select("select * from user")
    public List<User> getAllUsers();
}
