package com.emiyez.springboot01.entity;/*
 *@title Provider
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/8/23 15:39
 */

import lombok.Data;

@Data
public class Goods {
    private Long goodId;
    private String goodsName;
    private int goodsPrice;
    private int goodsCount;
}
