package com.mu.demo.dao.spring;

import com.mu.demo.model.Product;
import com.mu.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述: </br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/12/5 15:43
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@Mapper
public interface ProductDao {

    Product findById(int id);

    List<Product> findAll();
}
