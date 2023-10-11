package com.emiyez.springboot01.mapper;/*
 *@title AddrMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 17:09
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emiyez.springboot01.entity.Address;
import com.emiyez.springboot01.utils.ResultAjax;
import org.springframework.stereotype.Repository;

@Repository("addrMapper")
public interface AddrMapper extends BaseMapper<Address> {
    public ResultAjax findAddr();
}
