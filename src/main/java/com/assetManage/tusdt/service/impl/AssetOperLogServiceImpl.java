package com.assetManage.tusdt.service.impl;

import com.assetManage.tusdt.model.bo.OperLogListBO;
import com.assetManage.tusdt.service.AssetOperLogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-04-22
 * Time: 15:16
 */
@Service
public class AssetOperLogServiceImpl implements AssetOperLogService {
    @Override
    public List<OperLogListBO> getOperLogList(Integer userId, String StartTime, String endTime) {
        return null;
    }
}
