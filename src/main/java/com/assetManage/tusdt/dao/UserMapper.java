package com.assetManage.tusdt.dao;

import java.util.List;

import com.assetManage.tusdt.model.User;
import com.assetManage.tusdt.model.UserExample;
import com.assetManage.tusdt.model.bo.UserListBO;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByUserName(@Param("userName") String userName,@Param("userId") Integer userId);
}