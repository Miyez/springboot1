package com.emiyez.springboot01.entity;/*
 *@title Bills
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/10 16:13
 */

import lombok.Data;

@Data
public class Bills {

    private Long BillsId;
    private int Buyers;
    private String goodsName;
    private int gooodsId;
    private String BuyTime;
    private int price;


}
