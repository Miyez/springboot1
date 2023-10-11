package com.emiyez.springboot01.controller;/*
 *@title pageInitController
 *@description 初始化侧边菜单
 *@author 24844
 *@version 1.0
 *@create 2023/9/24 9:53
 */



import com.emiyez.springboot01.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class pageInitController {

    @Resource
    private MenuService menuService;

    @RequestMapping("menu")
    @ResponseBody
    public Map<String, Object> menu() {
        System.out.println(menuService.getMenu());
        return menuService.getMenu();
    }
}
