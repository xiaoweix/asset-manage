package com.assetManage.tusdt.dao;

import com.assetManage.tusdt.model.AssetLog;
import com.assetManage.tusdt.model.AssetLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetLogMapper {
    int countByExample(AssetLogExample example);

    int deleteByExample(AssetLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetLog record);

    int insertSelective(AssetLog record);

    List<AssetLog> selectByExample(AssetLogExample example);

    AssetLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetLog record, @Param("example") AssetLogExample example);

    int updateByExample(@Param("record") AssetLog record, @Param("example") AssetLogExample example);

    int updateByPrimaryKeySelective(AssetLog record);

    int updateByPrimaryKey(AssetLog record);
}