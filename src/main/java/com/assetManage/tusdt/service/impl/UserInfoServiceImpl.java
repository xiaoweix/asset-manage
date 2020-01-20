package com.assetManage.tusdt.service.impl;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.dao.UserMapper;
import com.assetManage.tusdt.model.User;
import com.assetManage.tusdt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-01-16
 * Time: 15:40
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> getUserList(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public ResponseData<String> addUser(User user) {
        ResponseData<String> responseData = new ResponseData<>();
        Integer result = userMapper.insert(user);
        if (result == 1) {
            responseData.setOK("插入成功");
        } else {
            responseData.setError("插入失败");
        }
        return responseData;
    }
}
