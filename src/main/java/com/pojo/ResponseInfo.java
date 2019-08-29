package com.pojo;

import java.util.List;

public class ResponseInfo {

    /**
     * 权力事项类型（附表）
     */
    private String powerType;
    /**
     * 外网二次提交必填，
     */
    private String receiveNum;
    /**
     * 网办暂存接口返回的信息“,
     */
    private String tempId;
    /**
     * sp： 外网首次提交 bqbz:外网二次提交”，
     */
    private String state;
    /**
     * 是否企业设立
     */
    private String isSetUp;
    /**
     * 事项ID
     */
    private String itemId;
    /**
     * 事项CODE
     */
    private String itemCode;
    /**
     * 事项名称
     */
    private String itemName;
    /**
     * 事项所属单位
     */
    private String orgCode;
    /**
     * 事项所属单位名称
     */
    private String orgName;
    /**
     * “服务对象类型”，（1：人员；2：项目 3：企业）
     */
    private String objectType;
    /**
     * 表单数据ID
     */
    private String dataId;
    /**
     * 表单ID
     */
    private String formId;

    /**
     * 材料列表
     */
    private List<Metail> metail;

    /**
     *
     * @return 公司信息
     */
   private  ResponseCompany info;

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(String receiveNum) {
        this.receiveNum = receiveNum;
    }

    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsSetUp() {
        return isSetUp;
    }

    public void setIsSetUp(String isSetUp) {
        this.isSetUp = isSetUp;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public List<Metail> getMetail() {
        return metail;
    }

    public void setMetail(List<Metail> metail) {
        this.metail = metail;
    }

    public ResponseCompany getInfo() {
        return info;
    }

    public void setInfo(ResponseCompany info) {
        this.info = info;
    }
}
