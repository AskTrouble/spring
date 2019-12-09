package com.mu.demo.controller;

import com.mu.demo.model.Product;
import com.mu.demo.service.ProductService;
import com.mu.demo.service.UserService;
import com.mu.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/model")
@EnableAutoConfiguration
public class ModelController {
 
    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getAllUser")
    public ResultVo getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/getProudctById")
    public Product findProudctById(@RequestParam(value = "id") int id){
        return productService.findById(id);
    }
}