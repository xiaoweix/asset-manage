package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.User;
import com.assetManage.tusdt.service.UserInfoService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-01-15
 * Time: 19:51
 */
@Api(protocols = "http,https", tags = {"UserManage"}, value = "/asset_manage/user",description = "用户信息管理")
@RestController
@RequestMapping(value = "/asset_manage/user")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @ApiOperation(value = "测试Hello", notes = "测试Hello")
    @ResponseBody
    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    public ResponseData<String> HelloTusdt() {
        ResponseData<String> responseData = new ResponseData<>();
        responseData.setOK("Hello Asset Manage!");
        return responseData;
    }



    @ApiOperation(value = "获取用户列表", notes = "参数name可以模糊查询")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "查询成功"),})
    @ApiImplicitParam(name = "userName", value = "用户名称", paramType = "query", required = false, dataType = "String")
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<List<User>> getUserList(@RequestParam(value = "userName",required = false) String userName) {

        ResponseData<List<User>> responseData = new ResponseData<>();
        List<User> userList = userInfoService.getUserList(userName);
        if(userList == null || userList.size() == 0) {
            responseData.setError("获取失败");
        }
        responseData.set("获取成功",userList);
        return responseData;
    }

    @ApiOperation(value = "新增一个用户", notes = "增加用户")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "添加成功"),})
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> addUser(@RequestBody User user) {

        ResponseData<String> responseData;
        responseData = userInfoService.addUser(user);
        return responseData;
    }
}
