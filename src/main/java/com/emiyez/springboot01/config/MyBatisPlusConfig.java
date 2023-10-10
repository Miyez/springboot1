package com.emiyez.springboot01.config;/*
 *@title JoinDefaultSqlInjector
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/9 18:13
 */

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import icu.mhb.mybatisplus.plugln.injector.JoinDefaultSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@Configuration
@EnableTransactionManagement
public class MyBatisPlusConfig extends JoinDefaultSqlInjector {


    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
        return super.getMethodList(mapperClass);
    }

        /**
        * 分页插件定义
        * @return
        */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new
                PaginationInterceptor();
// 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求 默认false
// paginationInterceptor.setOverflow(false);
// 设置最大单页限制数量，默认 500 条，-1 不受限制
// paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }

}