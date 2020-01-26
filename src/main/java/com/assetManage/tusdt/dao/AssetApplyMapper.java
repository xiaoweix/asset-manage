package com.assetManage.tusdt.dao;

import com.assetManage.tusdt.model.AssetApply;
import com.assetManage.tusdt.model.AssetApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetApplyMapper {
    int countByExample(AssetApplyExample example);

    int deleteByExample(AssetApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssetApply record);

    int insertSelective(AssetApply record);

    List<AssetApply> selectByExample(AssetApplyExample example);

    AssetApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssetApply record, @Param("example") AssetApplyExample example);

    int updateByExample(@Param("record") AssetApply record, @Param("example") AssetApplyExample example);

    int updateByPrimaryKeySelective(AssetApply record);

    int updateByPrimaryKey(AssetApply record);
}