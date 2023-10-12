package com.emiyez.springboot01.service;/*
 *@title ProviderService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */


import com.emiyez.springboot01.entity.Bills;
import com.emiyez.springboot01.entity.Goods;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.service.JoinIService;

import java.util.List;

public interface BillsService extends JoinIService<Bills> {
    /**
     * 获得所有供应商信息
     * @return
     */
    public ResultAjax findBillsList(int page, int limit, String BeginTime, String EndTime);

    /**
     * 查询供应商总数
     * @return
//     */
//    public int findBillsCount();



}
