package com.assetManage.tusdt.dao;

import com.assetManage.tusdt.model.AssetInfo;
import com.assetManage.tusdt.model.AssetInfoExample;
import java.util.List;

import com.assetManage.tusdt.model.bo.AssetListBO;
import org.apache.ibatis.annotations.Param;

public interface AssetInfoMapper {
    int countByExample(AssetInfoExample example);

    int deleteByExample(AssetInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetInfo record);

    int insertSelective(AssetInfo record);

    List<AssetInfo> selectByExample(AssetInfoExample example);

    AssetInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetInfo record, @Param("example") AssetInfoExample example);

    int updateByExample(@Param("record") AssetInfo record, @Param("example") AssetInfoExample example);

    int updateByPrimaryKeySelective(AssetInfo record);

    int updateByPrimaryKey(AssetInfo record);

    List<AssetListBO> selectAssetList(@Param("assetId") Integer assetId, @Param("assetName") String assetName, @Param("repositoryName") String repositoryName, @Param("status") Integer status, @Param("isVisible") Integer isVisible);
}