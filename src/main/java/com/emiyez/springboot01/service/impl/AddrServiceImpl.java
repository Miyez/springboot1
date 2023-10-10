package com.emiyez.springboot01.service.impl;/*
 *@title AddrServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 17:10
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emiyez.springboot01.entity.SmbmsAddress;

import com.emiyez.springboot01.mapper.AddrMapper;
import com.emiyez.springboot01.service.AddrService;

import com.emiyez.springboot01.utils.ResultAjax;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("addrService")
public class AddrServiceImpl extends ServiceImpl<AddrMapper, SmbmsAddress> implements AddrService {
    @Resource(name = "addrMapper")
    @Setter
    private AddrMapper addrMapper;


    @Override
    public ResultAjax findAllAddr() {

        List<SmbmsAddress> list = this.list();
        return ResultAjax.success(list);
    }
}
