package com.emiyez.springboot01.entity;/*
 *@title SysLog
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/16 15:35
 */

import lombok.Data;

import java.util.Date;

@Data
public class SysLog {

    private Long id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    private Date createTime;
}
