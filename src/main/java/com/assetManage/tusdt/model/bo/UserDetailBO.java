package com.assetManage.tusdt.model.bo;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-16
 * Time: 16:39
 */
public class UserDetailBO {

    private Integer id;

    private String userName;

    private String signature;

    private String telephone;

    private String email;

    private List<AssetUseHistoryBO> assetUseHistoryBOList;
}
