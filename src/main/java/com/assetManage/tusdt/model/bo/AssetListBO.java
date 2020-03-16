package com.assetManage.tusdt.model.bo;

import java.util.Date;

/**
 * Description:
 * Author: xxw
 * Date: 2020-03-16
 * Time: 00:34
 */
public class AssetListBO {

    private Integer id;

    private String assetName;

    private String version;

    private Integer status;

    private Date purchaseDate;

    private Integer isLend;

    private Integer isTake;

    private Integer isVisible;

    private Integer warehouseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getIsLend() {
        return isLend;
    }

    public void setIsLend(Integer isLend) {
        this.isLend = isLend;
    }

    public Integer getIsTake() {
        return isTake;
    }

    public void setIsTake(Integer isTake) {
        this.isTake = isTake;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(Integer warehouseName) {
        this.warehouseName = warehouseName;
    }
}
