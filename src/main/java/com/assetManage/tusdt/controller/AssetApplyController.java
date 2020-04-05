package com.assetManage.tusdt.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: xxw
 * Date: 2020-04-02
 * Time: 01:31
 */
@Api(protocols = "http,https", tags = {"AssetType"}, value = "/asset_manage/assetType",description = "申请信息相关")
@RestController
@RequestMapping(value = "/asset_manage/dataVisible")
public class AssetApplyController {


}
