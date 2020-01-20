package com.assetManage.tusdt.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
