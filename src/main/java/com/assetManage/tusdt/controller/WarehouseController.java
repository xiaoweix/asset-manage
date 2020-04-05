package com.assetManage.tusdt.controller;

import com.assetManage.tusdt.base.common.Pagination;
import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.base.constants.Response;
import com.assetManage.tusdt.model.Warehouse;
import com.assetManage.tusdt.model.bo.AssetListBO;
import com.assetManage.tusdt.model.bo.WarehouseBO;
import com.assetManage.tusdt.service.WarehouseInfoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-02-09
 * Time: 13:36
 */
@Api(protocols = "http,https", tags = {"Repository"}, value = "/asset_manage/repository",description = "仓库管理")
@RestController
@RequestMapping(value = "/asset_manage/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseInfoService warehouseInfoService;


    @ApiOperation(value = "新建仓库", notes = "新建仓库")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "添加成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/addWarehouse", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> addAsset(@RequestBody Warehouse warehouse) {

        ResponseData<String> responseData;
        responseData = warehouseInfoService.addWarehouse(warehouse);
        return responseData;
    }


    @ApiOperation(value = "获取仓库列表", notes = "参数name可以模糊查询")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "查询成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/warehouseList", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<List<WarehouseBO>> warehouseList(@RequestParam(name = "currPage", required = false, defaultValue = "1") Integer currPage,
                                                               @RequestParam(name = "pageSize", required = false, defaultValue = "20") Integer pageSize,
                                                               @RequestParam(value = "warehouseName",required = false) String warehouseName,
                                                               @RequestParam(value = "assetId",required = false) Integer id,
                                                               @RequestParam(value = "address",required = false) String address
    ) {

        ResponseData<List<WarehouseBO>> responseData = new ResponseData<>();
        List<WarehouseBO> warehouseList = warehouseInfoService.getWarehouseList(currPage,pageSize,id,warehouseName,address);
        if(warehouseList == null ) {
            responseData.setError("获取失败");
        } else {
            responseData.set("获取成功",warehouseList);
        }
        return responseData;
    }

    @ApiOperation(value = "删除仓库", notes = "删除仓库")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "删除成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/removeWarehouse", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<String> removeWarehouse(HttpServletRequest request,
                                                @RequestParam(value = "warehouseId",required = true) Integer warehouseId) {

        ResponseData<String> responseData = new ResponseData<>();
        responseData = warehouseInfoService.removeWarehouse(warehouseId);
        return responseData;
    }

    @ApiOperation(value = "编辑仓库", notes = "编辑仓库")
    @ApiResponses({@ApiResponse(code = Response.OK, message = "修改成功"),})
    @ApiImplicitParams(
            value = {
                    @ApiImplicitParam(paramType = "header", name = "token", dataType = "String", required = true, value = "token"),
            }
    )
    @RequestMapping(value = "/modifyWarehouse", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<String> modifyWarehouse(@RequestBody Warehouse warehouse) {

        ResponseData<String> responseData;
        responseData = warehouseInfoService.modifyWarehouse(warehouse);
        return responseData;
    }

}
