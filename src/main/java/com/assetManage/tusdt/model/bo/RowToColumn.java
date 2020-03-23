package com.assetManage.tusdt.model.bo;

import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-23
 * Time: 11:43
 */
public class RowToColumn {

    private String keyField;

    private String groupField;

    private String dataField;

    private List<FieldInfo> fieldInfoList;

    class FieldInfo {

        String fieldName;

        String fieldType;

        String fieldFormat;

        Integer fieldLength;

        Integer uniteType;

    }
}
