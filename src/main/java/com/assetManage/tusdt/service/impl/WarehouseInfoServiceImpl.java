package com.assetManage.tusdt.service.impl;

import com.assetManage.tusdt.base.common.Pagination;
import com.assetManage.tusdt.base.common.ResponseData;
import com.assetManage.tusdt.constants.CommonConstant;
import com.assetManage.tusdt.dao.WarehouseMapper;
import com.assetManage.tusdt.model.Warehouse;
import com.assetManage.tusdt.model.bo.WarehouseBO;
import com.assetManage.tusdt.service.WarehouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-23
 * Time: 13:49
 */
@Service
public class WarehouseInfoServiceImpl implements WarehouseInfoService {

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public ResponseData<String> addWarehouse(Warehouse warehouse) {
        ResponseData<String> responseData = new ResponseData<>();
        warehouse.setCreateTime(new Date());
        warehouse.setIsDelete(CommonConstant.DELETED_NO);
        Integer id = warehouseMapper.insert(warehouse);
        responseData.setOK("添加成功");
        return responseData;
    }

    @Override
    public ResponseData<String> modifyWarehouse(Warehouse warehouse) {
        return null;
    }

    @Override
    public ResponseData<String> removeWarehouse(Integer id) {
        return null;
    }

    @Override
    public List<WarehouseBO> getWarehouseList(Integer currPage, Integer pageSize, Integer warehouseId, String warehouseName, String address) {
        List<WarehouseBO> warehouseBOList = warehouseMapper.warehouseList(warehouseId, warehouseName, address);

        return warehouseBOList;
    }
}
