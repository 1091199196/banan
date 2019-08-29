package com.pojo;

import com.parse.getType;

public class Record {
    /**
     *
     */
    private String DATA_ID;
    /**
     * 1激活状态；0非激活态
     */
    private String ACTIVE;
    /**
     * 部门名称
     */
    private String ORG_NAME;
    /**
     * 部门编号
     */
    private String REGION_CODE;
    /**
     *环节类型
     */
    private String NODE_TYPE;
    /**
     * 事项id
     */
    private String ITEM_ID;
    /**
     * 事项编码
     */
    private String ITEM_CODE;
    /**
     * 接收时间
     */
    private String RECEIVE_TIME;

    /**
     * 审批老师
     */
    private String USER_NAME;
    /**
     * 办理状态
     */
    private String CURRENT_NODE_NAME;

    /**
     * 事项名称
     */
    private String ITEM_NAME;

    /**
     * 用户code
     */
    private String USER_CODE;

    /**
     * 业务状态
     *   01正常
     *   02 不予受理
     *   03 预审撤销
     *   11 待预审
     *   12 预审通过
     *   13预审撤销
     *   14预审驳回
     *   15：并联业务补齐
     *   16：预审通过
     *   21：补齐补正
     *   23 挂起
     *   24 收费挂起
     *   25 挂起
     *   26 待预审
     *   27：上报
     *   28：退回
     *   95：申请退件
     *   96：退件
     *   97：作废
     *   98：不予许可
     *   99：准许许可
     */
    private String STATUS;
    /**
     * 完成时间
     */
    private String FINISH_TIME;
    /**
     * 区域名称
     */
    private String REGION_NAME;
    /**
     * 区域编号
     */
    private String ORG_CODE;

    /**
     *
     */
    private String SEND_TIME;
    /**
     * 期限时间
     */
    private String LIMIT_TIME;
    /**
     * 审批结果
     */
    private String OPINION;
    /**
     * 表单id
     */
    private String FORM_ID;

    /**
     * 业务流程的定义ID
     */
    private String CURRENT_NODE_ID;
    /**
     * 环节id
     */
    private String FLOW_DEFINEID;

    public String getDATA_ID() {
        return DATA_ID;
    }

    public void setDATA_ID(String DATA_ID) {
        this.DATA_ID = DATA_ID;
    }

    public String getACTIVE() {
        return ACTIVE;
    }

    public void setACTIVE(String ACTIVE) {
        this.ACTIVE = ACTIVE;
    }

    public String getORG_NAME() {
        return ORG_NAME;
    }

    public void setORG_NAME(String ORG_NAME) {
        this.ORG_NAME = ORG_NAME;
    }

    public String getREGION_CODE() {
        return REGION_CODE;
    }

    public void setREGION_CODE(String REGION_CODE) {
        this.REGION_CODE = REGION_CODE;
    }

    public String getNODE_TYPE() {
        return NODE_TYPE;
    }

    public void setNODE_TYPE(String NODE_TYPE) {
        this.NODE_TYPE = NODE_TYPE;
    }

    public String getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(String ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    public String getITEM_CODE() {
        return ITEM_CODE;
    }

    public void setITEM_CODE(String ITEM_CODE) {
        this.ITEM_CODE = ITEM_CODE;
    }

    public String getRECEIVE_TIME() {
        return RECEIVE_TIME;
    }

    public void setRECEIVE_TIME(String RECEIVE_TIME) {
        this.RECEIVE_TIME = RECEIVE_TIME;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getCURRENT_NODE_NAME() {
        return CURRENT_NODE_NAME;
    }

    public void setCURRENT_NODE_NAME(String CURRENT_NODE_NAME) {
        this.CURRENT_NODE_NAME = CURRENT_NODE_NAME;
    }

    public String getITEM_NAME() {
        return ITEM_NAME;
    }

    public void setITEM_NAME(String ITEM_NAME) {
        this.ITEM_NAME = ITEM_NAME;
    }

    public String getUSER_CODE() {
        return USER_CODE;
    }

    public void setUSER_CODE(String USER_CODE) {
        this.USER_CODE = USER_CODE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = getType.getResult(STATUS);
    }

    public String getFINISH_TIME() {
        return FINISH_TIME;
    }

    public void setFINISH_TIME(String FINISH_TIME) {
        this.FINISH_TIME = FINISH_TIME;
    }

    public String getREGION_NAME() {
        return REGION_NAME;
    }

    public void setREGION_NAME(String REGION_NAME) {
        this.REGION_NAME = REGION_NAME;
    }

    public String getORG_CODE() {
        return ORG_CODE;
    }

    public void setORG_CODE(String ORG_CODE) {
        this.ORG_CODE = ORG_CODE;
    }

    public String getSEND_TIME() {
        return SEND_TIME;
    }

    public void setSEND_TIME(String SEND_TIME) {
        this.SEND_TIME = SEND_TIME;
    }

    public String getLIMIT_TIME() {
        return LIMIT_TIME;
    }

    public void setLIMIT_TIME(String LIMIT_TIME) {
        this.LIMIT_TIME = LIMIT_TIME;
    }

    public String getOPINION() {
        return OPINION;
    }

    public void setOPINION(String OPINION) {
        this.OPINION = OPINION;
    }

    public String getFORM_ID() {
        return FORM_ID;
    }

    public void setFORM_ID(String FORM_ID) {
        this.FORM_ID = FORM_ID;
    }

    public String getCURRENT_NODE_ID() {
        return CURRENT_NODE_ID;
    }

    public void setCURRENT_NODE_ID(String CURRENT_NODE_ID) {
        this.CURRENT_NODE_ID = CURRENT_NODE_ID;
    }

    public String getFLOW_DEFINEID() {
        return FLOW_DEFINEID;
    }

    public void setFLOW_DEFINEID(String FLOW_DEFINEID) {
        this.FLOW_DEFINEID = FLOW_DEFINEID;
    }
}
