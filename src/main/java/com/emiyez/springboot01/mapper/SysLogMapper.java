package com.emiyez.springboot01.mapper;/*
 *@title SysLogMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/16 15:39
 */

import com.emiyez.springboot01.entity.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface SysLogMapper {

    //保存信息到日志表

    @Insert("insert into test3.sys_log(USERNAME,OPERATION,TIME,METHOD,PARAMS,IP) " +
            "values(#{username},#{operation},#{time},#{method},#{params},#{ip})")
    public void saveSysLog(SysLog syslog) ;
}
