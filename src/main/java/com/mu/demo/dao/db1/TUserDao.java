package com.mu.demo.dao.db1;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageRowBounds;
import com.mu.demo.model.TUser;
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
public interface TUserDao {

    /**
     * 用户数据新增
     */
    @Insert("insert into t_user(name,age) values (#{name},#{age})")
    void addTUser(TUser user);

    /**
     * 用户数据修改
     */
    @Update("update t_user set name=#{name} where id=#{id}")
    void updateTUser(TUser user);

    /**
     * 用户数据删除
     */
    @Delete("delete from t_user where id=#{id}")
    void deleteTUser(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT * FROM t_user where name=#{name}")
    TUser findByName(@Param("name") String name);


    @Select("select * from t_user")
    public List<TUser> getAllTUsers();

    @Select("select * from t_user")
    public Page<TUser> getPage(PageRowBounds page);

    @Select("select * from t_user")
    public Page<TUser> getPageSize(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}
