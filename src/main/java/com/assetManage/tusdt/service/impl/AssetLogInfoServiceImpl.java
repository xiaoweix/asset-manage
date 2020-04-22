package com.assetManage.tusdt.service.impl;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.model.bo.AssetLogInfoDetailBO;
import com.assetManage.tusdt.model.bo.AssetLogListBO;
import com.assetManage.tusdt.service.AssetLogInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-04-22
 * Time: 15:14
 */
@Service
public class AssetLogInfoServiceImpl implements AssetLogInfoService {

    @Override
    public List<AssetLogListBO> getAssetApplyList(Integer currPage, Integer pageSize, Integer assetId, String userName, Integer status, String telephone, Integer jobLevel) {
        return null;
    }

    @Override
    public ResponseData<AssetLogInfoDetailBO> getApplyInfoDetail(Integer applyId) {
        return null;
    }

    @Override
    public ResponseData<String> agreeApply(Integer applyId) {
        return null;
    }

    @Override
    public ResponseData<String> refuseApply(Integer applyId) {
        return null;
    }
}
