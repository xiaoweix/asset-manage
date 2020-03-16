package com.assetManage.tusdt.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-16
 * Time: 16:17
 */
@Api(protocols = "http,https", tags = {"User"}, value = "/asset_manage/user",description = "用户登录注册")
@RestController
@RequestMapping(value = "/asset_manage/user")
public class LoginRegisterController {


}
