package com.emiyez.springboot01.mapper;/*
 *@title ProviderMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:07
 */


import com.emiyez.springboot01.entity.Bills;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BillsMapper {
    /**
     * 获得所有供应商信息
     * @return
     */
    public List<Bills> findBillsList(@Param("page") int page,
                                        @Param("limit") int limit,
                                        @Param("BeginTime") String BeginTime,
                                        @Param("EndTime") String EndTime
    );
    /**
     * 查询供应商总数
     * @return
     */
    public int findBillsCount();


}


