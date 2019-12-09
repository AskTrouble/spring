package com.mu.demo.service;

import com.mu.demo.vo.ResultVo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
 
    public ResultVo getAllUsers();
    
}