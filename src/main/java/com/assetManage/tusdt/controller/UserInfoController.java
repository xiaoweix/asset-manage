package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.model.User;
import com.assetManage.tusdt.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-01-15
 * Time: 19:51
 */
@RestController
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/Hello")
    public String HelloTusdt() {
        return "Hello Asset Manage!";
    }

    @ResponseBody
    @RequestMapping(value = "/user")
    public List<User> getUserList(@RequestParam(value = "userName",required = false) String userName) {
        return userInfoService.getUserList(userName);
    }
}
