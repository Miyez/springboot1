package com.emiyez.springboot01.service.impl;/*
 *@title ProviderServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.emiyez.springboot01.entity.Goods;
import com.emiyez.springboot01.entity.User;
import com.emiyez.springboot01.mapper.GoodsMapper;
import com.emiyez.springboot01.service.GoodsService;
import com.emiyez.springboot01.utils.ResultAjax;
import icu.mhb.mybatisplus.plugln.base.service.impl.JoinServiceImpl;
import icu.mhb.mybatisplus.plugln.core.JoinLambdaWrapper;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl extends JoinServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Resource
    @Setter
    private GoodsMapper goodsMapper;
    @Override
    public ResultAjax findGoodsList(@RequestParam(value = "page")int page,
                                     @RequestParam(value ="limit")int limit,
                                     @RequestParam(value ="goodsName",defaultValue = "") String goodsName
    ){

        Page<Goods> p = new Page<>(page,limit);
//        List<User> users = this.baseMapper.selectList(null);
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        if (!"".equals(goodsName)){
            wrapper.like("goodsName",goodsName);
        }
        Page<Goods> goodsPage = goodsMapper.selectPage(p,wrapper);


//        int offset = (page-1)*limit;
//        List<Goods> goods = goodsMapper.findGoodsList(offset,limit,goodsName);

        return ResultAjax.ProviderSuccess(goodsPage.getRecords(),(int)goodsPage.getTotal());
    }

//    @Override
//    public int findGoodsCount() {
//
//        return goodsMapper.findGoodsCount();
//    }

//    @Override
//    public int delProviderById(Long id) {
//        return  goodsMapper.delProviderById(id);
//    }

//    @Override
//    public ResultAjax pageList(){
//        Page<User> page = new Page<>(1,2);
//        Page<User> smbmsUserPage1 = goodsMapper.selectPage(page, null);
//
//        System.out.println("总条数：" + page.getTotal());
//        System.out.println("每页显示条数：" + page.getSize());
//        System.out.println("总页数：" + page.getPages());
//        System.out.println("当前页：" + page.getCurrent());
//        System.out.println("是否有上一页：" + page.hasPrevious());
//        System.out.println("是否有下一页：" + page.hasNext());
//        System.out.println("查询结果：" + page.getRecords());
//        return ResultAjax.success(smbmsUserPage1);
//    }
}

