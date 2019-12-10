package com.mu.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mu.demo.dao.spring.ProductDao;
import com.mu.demo.model.Product;
import com.mu.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findListByPage() {
        Page<?> page =PageHelper.startPage(2,2);
        List<Product> list = productDao.findAll();
        Long pageTotal = page.getTotal();

        log.info("数据：{}，总页数：{}", list, pageTotal);
        return list;
    }
}
