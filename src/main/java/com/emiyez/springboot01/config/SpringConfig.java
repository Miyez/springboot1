package com.emiyez.springboot01.config;/*
 *@title SpringConfig
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/8 14:18
 */

import com.emiyez.springboot01.entity.Provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Value("${name}") //写入yml中对应的key
    private String name ;

    @Bean(name = "provider")
    public Provider getProvider(){
        Provider provider = new Provider();
        provider.setProDesc(name);
        return provider;
    }
}
