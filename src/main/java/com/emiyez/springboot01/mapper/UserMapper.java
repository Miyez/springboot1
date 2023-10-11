package com.emiyez.springboot01.mapper;/*
 *@title UserMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:29
 */


import com.emiyez.springboot01.entity.User;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.mapper.JoinBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository("userMapper")
public interface UserMapper extends JoinBaseMapper<User> {
    public ResultAjax getUserByUserCode(String userCode);

    public List<User> UserList(@Param("page") int page,
                               @Param("limit") int limit);


    public int findUserCount();


    public int userEdit(
            @Param("addr") int addr,
            @Param("userId") Long userId);


}
