package com.emiyez.springboot01;/*
 *@title addrTest
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 17:16
 */

import com.emiyez.springboot01.service.AddrService;
import com.emiyez.springboot01.utils.ResultAjax;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.emiyez.springboot01.mapper")
public class addrTest {

    @Resource
    private AddrService addrService;

    @Test
    public void test2(){
        ResultAjax resultAjax = addrService.findAllAddr();
        System.out.println(resultAjax);
    }
}
