package com.emiyez.springboot01.service;/*
 *@title UserService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:30
 */


import com.emiyez.springboot01.entity.User;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.service.JoinIService;

import java.util.List;

public interface UserService extends JoinIService<User> {

    public User getUserByuerName(String userName);

    public ResultAjax UserList(int page,int limit);

//    public int findUserCount();

    public int userEdit(Long userId,int addr);


}
