package com.assetManage.tusdt.dao;

import com.assetManage.tusdt.model.AssetUse;
import com.assetManage.tusdt.model.AssetUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetUseMapper {
    int countByExample(AssetUseExample example);

    int deleteByExample(AssetUseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetUse record);

    int insertSelective(AssetUse record);

    List<AssetUse> selectByExample(AssetUseExample example);

    AssetUse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetUse record, @Param("example") AssetUseExample example);

    int updateByExample(@Param("record") AssetUse record, @Param("example") AssetUseExample example);

    int updateByPrimaryKeySelective(AssetUse record);

    int updateByPrimaryKey(AssetUse record);
}