package com.emiyez.springboot01.service;/*
 *@title ProviderService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */



import com.emiyez.springboot01.entity.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderService {
    /**
     * 获得所有供应商信息
     * @return
     */
    public List<Provider> findProviderList(Long id);


    public int delProviderById(Long id);

}
