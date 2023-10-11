package com.emiyez.springboot01.mapper;/*
 *@title MenuMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/24 11:09
 */


import com.emiyez.springboot01.entity.Menu;

import java.util.List;

public interface MenuMapper {
    //获得动态菜单的值
    public List<Menu> getMenu();

}
