package com.assetManage.tusdt.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: xxw
 * Date: 2020-02-09
 * Time: 13:36
 */
@Api(protocols = "http,https", tags = {"Repository"}, value = "/asset_manage/repository",description = "仓库管理")
@RestController
@RequestMapping(value = "/asset_manage/repository")
public class RepositoryInfoController {

}
