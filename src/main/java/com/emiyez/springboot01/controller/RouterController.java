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
    @RequestMapping(value = "/")
    public String loginpage(){
        return "/index.html";
    }

    @RequestMapping(value = "/main")
    public String mainpage(){
        return "/welcome.html";
    }
}
