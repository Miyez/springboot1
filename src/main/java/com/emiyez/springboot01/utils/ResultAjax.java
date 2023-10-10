package com.emiyez.springboot01.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/***
 * @title ResultAjax
 * @author 44326
 * @version 1.0.0
 * @create 2023/9/22 14:01
 *  用于返回的工具类
 **/
@Data
@AllArgsConstructor
public class ResultAjax {
    private Integer code;
    private String msg;
    private Object data;
    private Integer count;




    public static ResultAjax success(){
        return new ResultAjax(200,"请求成功",null,0);
    }
    public static ResultAjax success(Object o){
        return new ResultAjax(200,"请求成功",o,0);
    }

    public static ResultAjax ProviderSuccess(Object o,Integer count){
        return new ResultAjax(0,"请求成功",o,count);
    }
    public static ResultAjax fail(){
        return new ResultAjax(500,"请求失败",null,0);
    }

    public static ResultAjax successinit(Object o){
        return new ResultAjax(0,"",o,0);
    }
}
