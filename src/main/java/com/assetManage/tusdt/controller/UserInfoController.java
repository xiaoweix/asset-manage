package com.assetManage.tusdt.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: xxw
 * Date: 2020-01-15
 * Time: 19:51
 */
@RestController
public class UserInfoController {

    @ResponseBody
    @RequestMapping(value = "/Hello")
    public String HelloTusdt() {
        return "Hello Asset Manage!";
    }
}
