package com.mu.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 描述: </br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/12/5 15:27
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@Data
public class Product implements Serializable {

    private int id;

    private String code;

    private String name;

    private String desc;
}
