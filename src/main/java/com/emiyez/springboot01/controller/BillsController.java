package com.emiyez.springboot01.controller;/*
 *@title ProviderController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/25 16:07
 */


import com.emiyez.springboot01.entity.Bills;
import com.emiyez.springboot01.service.BillsService;
import com.emiyez.springboot01.utils.ResultAjax;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/bills")
public class BillsController {

    @Resource
    private BillsService billsService;

    @RequestMapping(value = "/BillsList" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultAjax providerList(@RequestParam(value = "page")int page,
                                   @RequestParam(value ="limit")int limit,
                                   @RequestParam(value ="BeginTime",defaultValue = "") String BeginTime,
                                   @RequestParam(value ="EndTime",defaultValue = "") String EndTime
                                   ){
        List<Bills> bills = billsService.findBillsList(page,limit,BeginTime,EndTime);
        return ResultAjax.ProviderSuccess(bills,billsService.findBillsCount());
    }

}
