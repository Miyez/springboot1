package com.emiyez.springboot01.controller;/*
 *@title UserController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 16:56
 */


import com.emiyez.springboot01.entity.SmbmsUser;
import com.emiyez.springboot01.service.UserService;
import com.emiyez.springboot01.utils.ResultAjax;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/user")
 public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/Login" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultAjax login(@RequestBody HashMap<String, String> map, HttpServletRequest request){
        SmbmsUser smbmsUser = userService.getUserByuerName(map.get("uname"));
        if (!smbmsUser.getUserPassword().equals(map.get("upwd"))){
            return ResultAjax.fail();
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("username",map.get("uname"));
            return ResultAjax.success();
        }
    }
}
