package com.emiyez.springboot01.controller;/*
 *@title ProviderController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:07
 */


import com.emiyez.springboot01.entity.Provider;
import com.emiyez.springboot01.service.ProviderService;
import com.emiyez.springboot01.utils.ResultAjax;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/pro")
public class ProviderController {

    @Resource
    private ProviderService providerService;

    @RequestMapping(value = "/providerList/{id}")
    @ResponseBody
    public ResultAjax providerList(@PathVariable("id") Long id) {
        List<Provider> providerList = providerService.findProviderList(id);
        return ResultAjax.success(providerList);
    }

    @RequestMapping(value = "/delproviderbyid/{id}")
    @ResponseBody
    public ResultAjax delProviderById(@PathVariable("id") Long id) {
        providerService.delProviderById(id);
        return ResultAjax.success();
    }


}
