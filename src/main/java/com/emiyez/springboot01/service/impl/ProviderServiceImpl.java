package com.emiyez.springboot01.service.impl;/*
 *@title ProviderServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:09
 */


import com.emiyez.springboot01.entity.Provider;
import com.emiyez.springboot01.mapper.ProviderMapper;
import com.emiyez.springboot01.service.ProviderService;
import lombok.Setter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Resource(name = "providerMapper")
    @Setter
    private ProviderMapper providerMapper;
    @Override
    public List<Provider> findProviderList(Long id) {
        return providerMapper.findProviderList(id);
    }

    @Override
    public int delProviderById(Long id) {
        return  providerMapper.delProviderById(id);
    }
}

