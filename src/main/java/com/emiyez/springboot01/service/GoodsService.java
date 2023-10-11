package com.emiyez.springboot01.service;/*
 *@title ProviderService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */



import com.emiyez.springboot01.entity.Goods;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.service.JoinIService;

import java.util.List;

public interface GoodsService extends JoinIService<Goods> {
    /**
     * 获得所有供应商信息
     * @return
     */
    public ResultAjax findGoodsList(int page, int limit, String goodsName);

//    public int findGoodsCount();


//    public int delProviderById(Long id);

}
