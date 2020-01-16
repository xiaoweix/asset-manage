package com.assetManage.tusdt.service;

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
}
