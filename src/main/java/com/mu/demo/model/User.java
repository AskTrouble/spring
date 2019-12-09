package com.mu.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述: </br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/12/5 15:05
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@Data
public class User implements Serializable {

    private String username;
    private String password;
    private String patternLock;

}
