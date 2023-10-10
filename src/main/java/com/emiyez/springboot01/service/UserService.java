package com.emiyez.springboot01.service;/*
 *@title UserService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:30
 */


import com.baomidou.mybatisplus.extension.service.IService;
import com.emiyez.springboot01.entity.SmbmsUser;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.service.JoinIService;

import java.util.List;

public interface UserService extends JoinIService<SmbmsUser> {

    public ResultAjax getList();

    public ResultAjax delUserById(Long id);

    public ResultAjax find_User_Addr_list();

    public ResultAjax find_User_Addr_list1();

    public ResultAjax pageList();

    public SmbmsUser getUserByuerName(String userName);

}
