package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.AssetType;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-16
 * Time: 00:26
 */
@Api(protocols = "http,https", tags = {"AssetType"}, value = "/asset_manage/assetType",description = "资源类型管理")
@RestController
@RequestMapping(value = "/asset_manage/assetType")
public class AssetTypeController {

    @ApiOperation(value = "新增一个标签", notes = "增加标签")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "添加成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/addAssetType", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> addAssetType(HttpServletRequest request, @RequestBody AssetType assetType) {

        ResponseData<String> responseData = null;
        //responseData = userInfoService.addUser(user);
        return responseData;
    }
}
