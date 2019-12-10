package com.mu.demo.controller;

import com.mu.demo.dao.db2.TStudentDao;
import com.mu.demo.model.Product;
import com.mu.demo.model.TStudent;
import com.mu.demo.service.ProductService;
import com.mu.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述: </br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/12/9 15:53
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@RestController
@RequestMapping(value = "/student")
@EnableAutoConfiguration
public class TStudentController {

    @Autowired
    private TStudentDao studentDao;

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody TStudent student) {
        studentDao.addTStudent(student);
    }

    @RequestMapping(value = "/getAllTStudents")
    public List<TStudent> getAllTStudents(){
        return studentDao.getAllTStudents();
    }
}
