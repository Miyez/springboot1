package com.emiyez.springboot01.service.impl;/*
 *@title UserServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:31
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.emiyez.springboot01.entity.Address;
import com.emiyez.springboot01.entity.Goods;
import com.emiyez.springboot01.entity.User;
import com.emiyez.springboot01.mapper.UserMapper;
import com.emiyez.springboot01.service.UserService;
import com.emiyez.springboot01.utils.ResultAjax;
import com.emiyez.springboot01.utils.UserVo;
import icu.mhb.mybatisplus.plugln.base.service.impl.JoinServiceImpl;
import icu.mhb.mybatisplus.plugln.core.JoinLambdaWrapper;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends JoinServiceImpl<UserMapper, User> implements UserService {

    @Resource(name = "userMapper")
    @Setter
    private UserMapper userMapper;


    /**
     * 登录方法
     * @param userName 用户名
     * @return
     */
    @Override
    public User getUserByuerName(String userName) {
        QueryWrapper<User> smbmsUserQueryWrapper = new QueryWrapper<>();
        smbmsUserQueryWrapper
                .select("userName","userPassword")
                .eq("userName",userName);
        return this.getOne(smbmsUserQueryWrapper);
    }

    @Override
    public ResultAjax UserList(@RequestParam(value = "page")int page,
                                     @RequestParam(value ="limit")int limit

    ){
        Page<User> p = new Page<>(page,limit);
//        List<User> users = this.baseMapper.selectList(null);
        Page<User> userPage = userMapper.selectPage(p, null);

//        int offset = (page-1)*limit;
//        List<User> users = userMapper.UserList(offset,limit);
        return ResultAjax.ProviderSuccess(userPage.getRecords(),(int)userPage.getTotal());
    }

//    public int findUserCount() {
//
//        return userMapper.findUserCount();
//    }

    @Override
    public int userEdit(Long userId,int addr) {


        return userMapper.userEdit(addr,userId);
    }

}