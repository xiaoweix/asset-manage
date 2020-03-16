package com.assetManage.tusdt.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-15
 * Time: 23:52
 */
@Api(protocols = "http,https", tags = {"logInfo"}, value = "/asset_manage/logInfo",description = "综合日志管理")
@RestController
@RequestMapping(value = "/asset_manage/logInfo")
public class AssetLogInfoController {
}
