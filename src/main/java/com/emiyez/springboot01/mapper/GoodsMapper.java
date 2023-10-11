package com.emiyez.springboot01.mapper;/*
 *@title ProviderMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:07
 */


import com.emiyez.springboot01.entity.Goods;
import icu.mhb.mybatisplus.plugln.base.mapper.JoinBaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("goodsMapper")
public interface GoodsMapper extends JoinBaseMapper<Goods> {
    /**
     * 获得所有商品信息
     * @return
     */
    public List<Goods> findGoodsList(@Param("page") int page,
                                     @Param("limit") int limit,
                                     @Param("goodsName") String goodsName);

    /**
     * 获取所有商品条数
     * @return
     */
    public int findGoodsCount();

}


