package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.bo.AssetLogListBO;
import com.assetManage.tusdt.service.AssetLogInfoService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-15
 * Time: 23:52
 */
@Api(protocols = "http,https", tags = {"logInfo"}, value = "/asset_manage/logInfo",description = "注册和登录接口")
@RestController
@RequestMapping(value = "/asset_manage/logInfo")
public class AssetLogInfoController {

    @Resource
    AssetLogInfoService assetLogInfoService;

    @ApiOperation(value = "获取综合日志列表", notes = "参数name可以模糊查询")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "查询成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/assetLogList", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<List<AssetLogListBO>> getAssetLogList(HttpServletRequest request,
                                                      @RequestParam(name = "currPage", required = false, defaultValue = "1") Integer currPage,
                                                      @RequestParam(name = "pageSize", required = false, defaultValue = "20") Integer pageSize,
                                                      @RequestParam(value = "assetId",required = false) Integer assetId,
                                                      @RequestParam(value = "userName",required = false) String userName,
                                                      @RequestParam(value = "status",required = false) Integer status,
                                                      @RequestParam(value = "telephone",required = false) String telephone,
                                                      @RequestParam(value = "jobLevel",required = false) Integer jobLevel) {

        ResponseData<List<AssetLogListBO>> responseData = new ResponseData<>();
        List<AssetLogListBO> assetLogListBOList = assetLogInfoService.getAssetApplyList(currPage, pageSize, assetId, userName, status, telephone, jobLevel);
        if(assetLogListBOList == null || assetLogListBOList.size() == 0) {
            responseData.setError("获取失败");
        }
        responseData.set("获取成功",assetLogListBOList);
        return responseData;
    }

}
