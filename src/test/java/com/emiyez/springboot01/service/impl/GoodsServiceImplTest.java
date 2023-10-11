package com.emiyez.springboot01.service.impl;

import junit.framework.TestCase;

/*
 *@title GoodsServiceImplTest
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/10 15:42
 */public class GoodsServiceImplTest extends TestCase {

    public void testFindGoodsList() {
        GoodsServiceImpl goodsService = new GoodsServiceImpl();
        goodsService.findGoodsList(1,2,"1");
    }
}