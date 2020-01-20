package com.assetManage.tusdt.service;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.model.User;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-01-16
 * Time: 15:35
 */
public interface UserInfoService {

    List<User> getUserList(String userName);

    ResponseData<String> addUser(User user);
}
