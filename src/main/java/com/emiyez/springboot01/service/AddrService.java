package com.emiyez.springboot01.service;/*
 *@title AddrService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 17:10
 */

import com.baomidou.mybatisplus.extension.service.IService;
import com.emiyez.springboot01.entity.SmbmsAddress;
import com.emiyez.springboot01.utils.ResultAjax;

public interface AddrService extends IService<SmbmsAddress> {
    public ResultAjax findAllAddr();
}
