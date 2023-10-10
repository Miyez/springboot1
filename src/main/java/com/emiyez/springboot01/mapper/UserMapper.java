package com.emiyez.springboot01.mapper;/*
 *@title UserMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:29
 */


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emiyez.springboot01.entity.SmbmsUser;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.mapper.JoinBaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper extends JoinBaseMapper<SmbmsUser> {
    public ResultAjax getUserByUserCode(String userCode);

    public List<SmbmsUser> getList();

    public List<SmbmsUser> find_User_Addr_list();

    public List<SmbmsUser> find_User_Addr_list1();


}
