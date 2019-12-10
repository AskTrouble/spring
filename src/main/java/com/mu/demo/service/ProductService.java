package com.mu.demo.service;

import com.mu.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述: </br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/12/5 15:44
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@Service
public interface ProductService {

    Product findById(int id);

    List<Product> findAll();

    public List<Product> findListByPage();

}
