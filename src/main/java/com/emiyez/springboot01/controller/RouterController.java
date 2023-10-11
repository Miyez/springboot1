package com.emiyez.springboot01.controller;/*
 *@title UserController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 16:56
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
 public class RouterController {
    /**
     * 登录界面
     * @return
     */
    @RequestMapping(value = "/")
    public String loginpage(){
        return "/login.html";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping(value = "/main")
    public String mainpage(){
        return "/main.html";
    }

    /**
     * 主页下的欢迎页面
     * @return
     */
    @RequestMapping(value = "/welcome")
    public String welcomepage(){
        return "/welcome.html";
    }

    /**
     * 商品管理页面
     * @return
     */
    @RequestMapping(value = "/goods")
    public String Goodspage(){
        return "/goods.html";
    }

    /**
     * 订单管理页面
     * @return
     */
    @RequestMapping(value = "/bills")
    public String Billspage(){
        return "/bills.html";
    }

    /**
     * 商品管理页面
     * @return
     */
    @RequestMapping(value = "/users")
    public String Userspage(){
        return "/users.html";
    }

    @RequestMapping(value = "/edit")
    public String Providereditpage(){
        return "/table/edit.html";
    }
}
