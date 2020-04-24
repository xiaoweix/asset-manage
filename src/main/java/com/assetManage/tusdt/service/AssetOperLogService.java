package com.assetManage.tusdt.service;

import com.assetManage.tusdt.model.bo.OperLogListBO;


import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-04-02
 * Time: 01:02
 */
public interface AssetOperLogService {

    List<OperLogListBO> getOperLogList(Integer userId, String StartTime, String endTime);


}
