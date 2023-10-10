package com.emiyez.springboot01.mapper;/*
 *@title ProviderMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:07
 */


import com.emiyez.springboot01.entity.Provider;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("providerMapper")
public interface ProviderMapper {
    /**
     * 获得所有供应商信息
     * @return
     */
    public List<Provider> findProviderList(@Param("id") Long id);
    /**
     * 删除供应商
     * @return
     */
    public int delProviderById(@Param("id")Long id);

}


