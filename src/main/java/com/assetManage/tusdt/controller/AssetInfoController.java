package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.Pagination;
import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.AssetInfo;
import com.assetManage.tusdt.model.bo.AssetListBO;
import com.assetManage.tusdt.service.AssetInfoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Description:
 * Author: xxw
 * Date: 2020-01-20
 * Time: 19:44
 */
@Api(protocols = "http,https", tags = {"Asset"}, value = "/asset_manage/asset",description = "资源管理管理")
@RestController
@RequestMapping(value = "/asset_manage/asset")
public class AssetInfoController {

    @Autowired
    AssetInfoService assetInfoService;


    @ApiOperation(value = "资源入库", notes = "增加资源")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "添加成功"),})
    @RequestMapping(value = "/addAsset", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> addAsset(@RequestBody AssetInfo assetInfo) {

        ResponseData<String> responseData;
        responseData = assetInfoService.addAsset(assetInfo);
        return responseData;
    }

    @ApiOperation(value = "获取资源列表", notes = "参数name可以模糊查询")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "查询成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/assetList", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<Pagination<AssetListBO>> getUserList(@RequestParam(name = "currPage", required = false, defaultValue = "1") Integer currPage,
                                                @RequestParam(name = "pageSize", required = false, defaultValue = "20") Integer pageSize,
                                                @RequestParam(value = "assetName",required = false) String assetName,
                                                @RequestParam(value = "assetId",required = false) Integer assetId,
                                                @RequestParam(value = "warehouseName",required = false) String warehouseName,
                                                @RequestParam(value = "status",required = false) Integer status
                                                ) {

        ResponseData<Pagination<AssetListBO>> responseData = new ResponseData<>();
        Pagination<AssetListBO> assetList = assetInfoService.getAssetList(currPage,pageSize,assetId,assetName,warehouseName,status);
        if(assetList == null ) {
            responseData.setError("获取失败");
        }
        responseData.set("获取成功",assetList);
        return responseData;
    }

    @ApiOperation(value = "获取资源详情", notes = "参数name可以模糊查询")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "查询成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/assetDetail", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<AssetInfo> assetDetail(@RequestParam(name = "id", required = true, defaultValue = "1") Integer id) {

        ResponseData<AssetInfo> responseData = assetInfoService.getAssetInfoDetail(id);
        return responseData;
    }

}
