package com.emiyez.springboot01;/*
 *@title userTest
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 15:01
 */

import com.emiyez.springboot01.service.UserService;
import com.emiyez.springboot01.utils.RedisUtil;
import com.emiyez.springboot01.utils.ResultAjax;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.emiyez.springboot01.mapper")
public class userTest {
    @Resource
    private UserService userService;

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void test(){
        redisUtil.setStr("u","u");

        System.out.println(redisUtil.getStr("u"));

//        redisTemplate.opsForValue().set("uname","王五");

//        System.out.println(redisTemplate.opsForValue().get("uname"));
//
//        redisTemplate.opsForZSet().add("zset1","zset-1",1.0);
//        redisTemplate.opsForZSet().add("zset1","zset-2",2.0);
//        redisTemplate.opsForZSet().add("zset1","zset-3",3.0);
//        redisTemplate.opsForZSet().add("zset1","zset-4",4.0);
//        redisTemplate.opsForZSet().add("zset1","zset-5",5.0);

//        String uname = redisUtil.getStr("uname");
//        System.out.println(uname);


    }
//
//    @Test
//    public void test(){
//        ResultAjax list = userService.getList();
//        System.out.println(list);
//    }
//
//    @Test
//    public void test1(){
//        ResultAjax resultAjax = userService.delUserById(50L);
//        System.out.println(resultAjax);
//    }
//
//    @Test
//    public void test2(){
//        ResultAjax resultAjax = userService.find_User_Addr_list();
//        System.out.println(resultAjax);
//    }

//    @Test
//    public void test3(){
//        ResultAjax resultAjax = userService.find_User_Addr_list1();
//        System.out.println(resultAjax);
//    }

//    @Test
//    public void page(){
//        ResultAjax resultAjax = userService.pageList();
//        System.out.println(resultAjax);
//    }

}
