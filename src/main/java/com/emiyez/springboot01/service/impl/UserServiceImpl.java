package com.emiyez.springboot01.service.impl;/*
 *@title UserServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:31
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emiyez.springboot01.entity.SmbmsAddress;
import com.emiyez.springboot01.entity.SmbmsUser;
import com.emiyez.springboot01.mapper.UserMapper;
import com.emiyez.springboot01.service.UserService;
import com.emiyez.springboot01.utils.ResultAjax;
import com.emiyez.springboot01.utils.UserVo;
import icu.mhb.mybatisplus.plugln.base.service.impl.JoinServiceImpl;
import icu.mhb.mybatisplus.plugln.core.JoinLambdaWrapper;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends JoinServiceImpl<UserMapper,SmbmsUser> implements UserService {

    @Resource(name = "userMapper")
    @Setter
    private UserMapper userMapper;


    @Override
    public ResultAjax getList() {
        QueryWrapper<SmbmsUser> id = new QueryWrapper<SmbmsUser>()
                .select("id","userCode","userName")
                .orderByAsc("id");
        List<SmbmsUser> list = list(id);
        return ResultAjax.success(list);
    }

    @Override
    public ResultAjax delUserById(Long id) {
        boolean b = this.removeById(id);
        return ResultAjax.success(b);
    }

    @Override
    public ResultAjax find_User_Addr_list() {
        List<SmbmsUser> userAddrList = userMapper.find_User_Addr_list();
        return ResultAjax.success(userAddrList);
    }

    @Override
    public ResultAjax find_User_Addr_list1(){
        JoinLambdaWrapper<SmbmsUser> wrapper = new JoinLambdaWrapper<>(SmbmsUser.class);
        wrapper.rightJoin(SmbmsAddress.class, SmbmsAddress::getUserId, SmbmsUser::getSid)
                .select(SmbmsAddress::getId)
                .end();
        return ResultAjax.success(this.joinList(wrapper, UserVo.class));
    }

    @Override
    public ResultAjax pageList(){
        Page<SmbmsUser> page = new Page<>(1,2);
        Page<SmbmsUser> smbmsUserPage1 = userMapper.selectPage(page, null);

        System.out.println("总条数：" + page.getTotal());
        System.out.println("每页显示条数：" + page.getSize());
        System.out.println("总页数：" + page.getPages());
        System.out.println("当前页：" + page.getCurrent());
        System.out.println("是否有上一页：" + page.hasPrevious());
        System.out.println("是否有下一页：" + page.hasNext());
        System.out.println("查询结果：" + page.getRecords());
        return ResultAjax.success(smbmsUserPage1);
    }
}