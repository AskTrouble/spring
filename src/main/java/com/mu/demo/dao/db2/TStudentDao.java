package com.mu.demo.dao.db2;

import com.mu.demo.model.TStudent;
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
public interface TStudentDao {

    /**
     * 用户数据新增
     */
    @Insert("insert into t_student(name,age) values (#{name},#{age})")
    void addTStudent(TStudent student);

    /**
     * 用户数据修改
     */
    @Update("update t_student set name=#{name} where id=#{id}")
    void updateTStudent(TStudent student);

    /**
     * 用户数据删除
     */
    @Delete("delete from t_student where id=#{id}")
    void deleteTStudent(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT * FROM t_student where name=#{name}")
    TStudent findByName(@Param("name") String name);


    @Select("select * from t_student")
    public List<TStudent> getAllTStudents();

}
