package com.emiyez.springboot01;/*
 *@title userTest
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 15:01
 */

import com.emiyez.springboot01.service.UserService;
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
public class userTest {
    @Resource
    private UserService userService;

    @Test
    public void test(){
        ResultAjax list = userService.getList();
        System.out.println(list);
    }

    @Test
    public void test1(){
        ResultAjax resultAjax = userService.delUserById(50L);
        System.out.println(resultAjax);
    }

    @Test
    public void test2(){
        ResultAjax resultAjax = userService.find_User_Addr_list();
        System.out.println(resultAjax);
    }

//    @Test
//    public void test3(){
//        ResultAjax resultAjax = userService.find_User_Addr_list1();
//        System.out.println(resultAjax);
//    }

    @Test
    public void page(){
        ResultAjax resultAjax = userService.pageList();
        System.out.println(resultAjax);
    }

}
