package com.emiyez.springboot01.controller;/*
 *@title ProviderController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:07
 */


import com.emiyez.springboot01.entity.Goods;
import com.emiyez.springboot01.service.GoodsService;
import com.emiyez.springboot01.utils.ResultAjax;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping(value = "/goodsList")
    @ResponseBody
    public ResultAjax findGoodsList(@RequestParam(value = "page")int page,
                                   @RequestParam(value ="limit")int limit,
                                   @RequestParam(value ="goodsName",defaultValue = "") String goodsName

    ){

        System.out.println("goodsName:"+goodsName);
        ResultAjax goodsList = goodsService.findGoodsList(page, limit, goodsName);
        //        return ResultAjax.ProviderSuccess(providerList,providerService.findProviderCount());
        return goodsList;
    }


}
