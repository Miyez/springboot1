package com.emiyez.springboot01.controller;/*
 *@title UserController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 16:56
 */


import com.emiyez.springboot01.entity.Bills;
import com.emiyez.springboot01.entity.User;
import com.emiyez.springboot01.log.Log;
import com.emiyez.springboot01.service.UserService;
import com.emiyez.springboot01.utils.ResultAjax;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/users")
 public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/Login" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultAjax login(@RequestBody HashMap<String, String> map, Model model){
        User user = userService.getUserByuerName(map.get("uname"));
        if (!user.getUserPassword().equals(map.get("upwd"))){
            return ResultAjax.fail();
        }else {
            model.addAttribute("user",user);
            return ResultAjax.success();
        }
    }

    @RequestMapping(value = "/UserList" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultAjax UserList(@RequestParam(value = "page")int page,
                                   @RequestParam(value ="limit")int limit
    ){
        return userService.UserList(page, limit);
    }

    @RequestMapping(value = "/userEdit" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultAjax providerEdit(
            @RequestParam(value = "addr") int addr,
            @RequestParam(value = "userId") Long userId){
        int i = userService.userEdit(userId,addr);
        return ResultAjax.success(i);
    }
}
