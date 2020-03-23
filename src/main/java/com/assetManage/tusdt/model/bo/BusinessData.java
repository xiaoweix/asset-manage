package com.assetManage.tusdt.model.bo;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-23
 * Time: 11:19
 */
public class BusinessData {

    private String keyField;

    private String valueField;

    List<FieldInfo> fieldInfoList;

    class FieldInfo {

        private String fieldName;

        private String keyValue;
    }



}
