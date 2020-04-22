package com.assetManage.tusdt.service.impl;

import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.constants.CommonConstant;
import com.assetManage.tusdt.dao.UserMapper;
import com.assetManage.tusdt.model.User;
import com.assetManage.tusdt.model.bo.RegisterUserBO;
import com.assetManage.tusdt.model.bo.UserDetailBO;
import com.assetManage.tusdt.model.bo.UserListBO;
import com.assetManage.tusdt.service.UserInfoService;
import com.assetManage.tusdt.utils.HashUtils;
import com.assetManage.tusdt.utils.JwtUtils;
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
    public List<UserListBO> getUserList(String userName) {
        return userMapper.selectByUserName(userName);
    }

    @Override
    public ResponseData<String> addUser(User user) {
        ResponseData<String> responseData = new ResponseData<>();
        Integer result = userMapper.insert(user);
        if (result == 1) {
            responseData.setOK("添加成功");
        } else {
            responseData.setError("添加失败");
        }
        return responseData;
    }

    @Override
    public ResponseData<UserDetailBO> getPersonnelDetail(Integer id) {
        return null;
    }

    @Override
    public ResponseData<User> getUserDetail(Integer id) {
        return null;
    }

    @Override
    public ResponseData<String> deleteUser(Integer id) {
        return null;
    }

    @Override
    public ResponseData<String> changeUserStatus(Integer id, Integer status) {
        return null;
    }

    @Override
    public ResponseData<String> modifyUserInfo(User user) {
        return null;
    }

    @Override
    public ResponseData<String> registerUser(RegisterUserBO registerUserBO) {
        return null;
    }

    @Override
    public ResponseData<String> changeUserInfoByMyself(RegisterUserBO registerUserBO) {
        return null;
    }

    @Override
    public String login(String email, String password) {
        String hashPassword = HashUtils.hashEncrypt(password, CommonConstant.PASSWORD_HASH);
        User user = userMapper.loginByEmail(email);
        String token = null;
        if(hashPassword.equals(user.getPassword())) {
            token = JwtUtils.geneJsonWebToken(user);
        }
        return token;
    }
}
