package com.emiyez.springboot01.service.impl;/*
 *@title MenuServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/24 11:16
 */


import com.emiyez.springboot01.entity.Menu;
import com.emiyez.springboot01.mapper.MenuMapper;
import com.emiyez.springboot01.service.MenuService;
import com.emiyez.springboot01.utils.TreeUtil;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Resource
    @Setter
    private MenuMapper menuMapper;

    @Override
    public Map<String, Object> getMenu() {
        Map<String, Object> map = new HashMap<>();
        Map<String,Object> home = new HashMap<>();
        Map<String,Object> logo = new HashMap<>();
        // 查询数据库：Mapper 层 ：List<SysMenu> findAllByStatusOrderBySort();
        List<Menu> menuList = menuMapper.getMenu();
        map.put("menuInfo", TreeUtil.toTree(menuList , 0));
        home.put("title","首页");
        home.put("href","welcome");//控制器路由,自行定义
        map.put("homeInfo",home);
        logo.put("title","后台管理系统");
        logo.put("image","static/images/logo.png");//静态资源文件路径,可使用默认的logo.png
        logo.put("href","");
        map.put("logoInfo",logo);
        return map;
    }
}
