package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.bo.RegisterUserBO;
import com.assetManage.tusdt.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @Resource
    private UserInfoService userInfoService;

    @ApiOperation(value = "注册", notes = "注册")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "注册信息提交成功"),})
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> register(@RequestBody RegisterUserBO registerUserBO) {

        ResponseData<String> responseData;
        responseData = userInfoService.registerUser(registerUserBO);
        return responseData;
    }

    @ApiOperation(value = "登录", notes = "登录")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "注册信息提交成功"),})
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<String> login(@RequestParam(value = "userName",required = true) String userName,
                                      @RequestParam(value = "password",required = true) String password) {

        ResponseData<String> responseData;
        responseData = userInfoService.login(userName,password);
        return responseData;
    }

}
