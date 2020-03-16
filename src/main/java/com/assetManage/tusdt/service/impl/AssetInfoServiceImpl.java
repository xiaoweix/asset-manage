package com.assetManage.tusdt.service.impl;

import com.assetManage.tusdt.base.common.Pagination;
import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.dao.AssetInfoMapper;
import com.assetManage.tusdt.model.AssetApply;
import com.assetManage.tusdt.model.AssetInfo;
import com.assetManage.tusdt.model.bo.AssetListBO;
import com.assetManage.tusdt.model.bo.AssetUseHistoryBO;
import com.assetManage.tusdt.service.AssetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-15
 * Time: 23:56
 */
@Service
public class AssetInfoServiceImpl implements AssetInfoService {

    @Autowired
    private AssetInfoMapper assetInfoMapper;

    @Override
    public ResponseData<String> addAsset(AssetInfo assetInfo) {
        ResponseData<String> responseData = new ResponseData<>();
        Integer result = assetInfoMapper.insert(assetInfo);
        if (result == 1) {
            responseData.setOK("插入成功");
        } else {
            responseData.setError("插入失败");
        }
        return responseData;
    }

    @Override
    public Pagination<AssetListBO> getAssetList(Integer currPage, Integer pageSize, Integer assetId, String assetName, String repositoryName, Integer status) {
//        PageMethod.startPage(currPage, pageSize);
        List<AssetListBO> assetListBOList = assetInfoMapper.selectAssetList(assetId, assetName, repositoryName, status,1);
        Pagination<AssetListBO> assetList = new Pagination<>(assetListBOList);
        return assetList;
    }

    @Override
    public ResponseData<String> assetApply(AssetApply assetApply) {
        return null;
    }

    @Override
    public Pagination<AssetUseHistoryBO> getAssetHistory(Integer currPage, Integer pageSize, Integer assetId, String assetName, String userName, Integer type) {
        return null;
    }


}
