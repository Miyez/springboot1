package com.emiyez.springboot01.service.impl;/*
 *@title ProviderServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.emiyez.springboot01.entity.Bills;
import com.emiyez.springboot01.entity.Goods;
import com.emiyez.springboot01.mapper.BillsMapper;
import com.emiyez.springboot01.mapper.GoodsMapper;
import com.emiyez.springboot01.service.BillsService;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.service.impl.JoinServiceImpl;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BillsServiceImpl extends JoinServiceImpl<BillsMapper, Bills> implements BillsService {

    @Resource
    @Setter
    private BillsMapper billsMapper;
    @Override
    public ResultAjax findBillsList(int page, int limit, String BeginTime, String EndTime) {
        Page<Bills> p = new Page<>(page,limit);
        QueryWrapper<Bills> wrapper = new QueryWrapper<>();
        if (!"".equals(BeginTime)){

            wrapper.gt("BuyTime",BeginTime);
        }
        if (!"".equals(EndTime)){
            wrapper.lt("BuyTime",EndTime);
        }

        Page<Bills> billsPage = billsMapper.selectPage(p, wrapper);


//        int offset = (page-1)*limit;
        return ResultAjax.ProviderSuccess(billsPage.getRecords(),(int)billsPage.getTotal());
    }

//    @Override
//    public int findBillsCount() {
//        return billsMapper.findBillsCount();
//    }

}
