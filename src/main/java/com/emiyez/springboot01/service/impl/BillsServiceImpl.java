package com.emiyez.springboot01.service.impl;/*
 *@title ProviderServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */


import com.emiyez.springboot01.entity.Bills;
import com.emiyez.springboot01.mapper.BillsMapper;
import com.emiyez.springboot01.service.BillsService;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BillsServiceImpl implements BillsService {

    @Resource
    @Setter
    private BillsMapper billsMapper;
    @Override
    public List<Bills> findBillsList(int page, int limit,String BeginTime, String EndTime) {
        int offset = (page-1)*limit;
        return billsMapper.findBillsList(offset,limit,BeginTime,EndTime);
    }

    @Override
    public int findBillsCount() {
        return billsMapper.findBillsCount();
    }

}
