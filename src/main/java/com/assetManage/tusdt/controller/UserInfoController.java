package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.User;
import com.assetManage.tusdt.model.bo.RegisterUserBO;
import com.assetManage.tusdt.model.bo.UserListBO;
import com.assetManage.tusdt.service.UserInfoService;
import com.assetManage.tusdt.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public ResponseData<String> HelloTusdt(HttpServletRequest request) {
        Claims claims = JwtUtils.validateToken(request);

        ResponseData<String> responseData = new ResponseData<>();
        responseData.setOK("Hello Asset Manage!");
        return responseData;
    }



    @ApiOperation(value = "获取用户列表", notes = "参数name可以模糊查询")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "查询成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<List<User>> getUserList(HttpServletRequest request,
                                                @RequestParam(name = "currPage", required = false, defaultValue = "1") Integer currPage,
                                                @RequestParam(name = "pageSize", required = false, defaultValue = "20") Integer pageSize,
                                                @RequestParam(value = "userId",required = false) Integer userId,
                                                @RequestParam(value = "userName",required = false) String userName,
                                                @RequestParam(value = "status",required = false) Integer status,
                                                @RequestParam(value = "telephone",required = false) String telephone,
                                                @RequestParam(value = "jobLevel",required = false) Integer jobLevel) {

        ResponseData<List<User>> responseData = new ResponseData<>();
        List<User> userList = userInfoService.getUserList(userName, userId);
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

