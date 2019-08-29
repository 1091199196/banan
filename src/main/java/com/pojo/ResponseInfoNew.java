package com.pojo;

import java.util.List;

public class ResponseInfoNew {
    /**
     * 事项id
     */
    private String itemId;
    /**
     * 事项Code
     */
    private String itemCode;

    /**
     * 事项名称
     */
    private String itemName;
    /**
     * 事项所属单位编码
     */
    private String orgCode;
    /**
     * 事项所属单位名称
     */
    private String orgName;
    /**
     * 服务对象类型（1：个人；2：项目 3：企业）
     */
    private String objectType;
    /**
     * 表单数据id
     */
    private String dataId;
    /**
     * 表单id
     */
    private String formId;
    /**
     * 申办编号（ state= bqbz时必填）
     */
    private String receiveNum;
    /**
     * 事项所属区划编码
     */
    private String regionCode;
    /**
     * 事项所属区划名称
     */
    private String regionName;
    /**
     * 办件类型；1承诺件、2即办件、3上报件、4联报件
     */
    private String assort;
    /**
     * 申请人登录用户名（账号）
     */
    private String account;
    /**
     * 申请人登录用户id
     */
    private String ucid;
    /**
     * 企业设立：1是 ；0否
     */
    private String isSetUp;
    /**
     * 密码（山东的密码自己生成，有密码则按传过来的为准，没密码按审批系统自己生成的为准）
     */
    private String password;

    /**
     * sp 外网首次提交  bqbz:外网二次提交
     */
    private String state;
    /**
     * 获取所需的材料
     */
    private List<Metail> metail;
    /**
     * 为止参数
     */
    private  String Transferred;
    /**
     * (JSON)
     */
    private ServiceList serviceList;

    private  Object info;

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

    public String getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(String receiveNum) {
        this.receiveNum = receiveNum;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getAssort() {
        return assort;
    }

    public void setAssort(String assort) {
        this.assort = assort;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUcid() {
        return ucid;
    }

    public void setUcid(String ucid) {
        this.ucid = ucid;
    }

    public String getIsSetUp() {
        return isSetUp;
    }

    public void setIsSetUp(String isSetUp) {
        this.isSetUp = isSetUp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Metail> getMetail() {
        return metail;
    }

    public void setMetail(List<Metail> metail) {
        this.metail = metail;
    }

    public ServiceList getServiceList() {
        return serviceList;
    }

    public void setServiceList(ServiceList serviceList) {
        this.serviceList = serviceList;
    }

    public String getTransferred() {
        return Transferred;
    }

    public void setTransferred(String transferred) {
        Transferred = transferred;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
}
