package com.mu.demo.vo;

import lombok.Data;

@Data
public class ResultVo<T> {
 
    private Integer code;
 
    private String msg;
 
    private T data;
 
    private ResultVo(T data){
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }
 
    private ResultVo(CodeMsg cm){
        if(cm==null){
            return;
        }else {
            this.code = cm.getCode();
            this.msg = cm.getMsg();
            this.data = null;
        }
    }
 
    public static <T> ResultVo<T> success(T data){
        return new ResultVo<T>(data);
    }
 
    public static <T> ResultVo<T> error(CodeMsg cm){
        return new ResultVo<T>(cm);
    }
 }