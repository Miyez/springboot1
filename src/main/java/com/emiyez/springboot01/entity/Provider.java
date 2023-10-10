package com.emiyez.springboot01.entity;/*
 *@title Provider
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/8/23 15:39
 */

import lombok.Data;

@Data
public class Provider {
    private Long id;
    private String proCode;
    private String proName;
    private String proDesc;
    private String proContact;
    private String proPhone;
    private String proAddress;
    private String proFax;
    private String creationDate;

}
