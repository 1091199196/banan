package com.pojo;

public class ServiceList {
    /**
     * 邮寄类型（0自取；1投递）
     * 为1时获取servicelist 里其他的参数值，为0时无需填写其他值
     */
    private String SendType;
    /**
     * 邮政编码
     */
    private String SendCityCode;
    /**
     * 收件地址
     */
    private String SendAddressee;
    /**
     * 收件人姓名
     */
    private String SendName;
    /**
     * 手机人手机
     */
    private String SendMobile;

    public String getSendType() {
        return SendType;
    }

    public void setSendType(String sendType) {
        SendType = sendType;
    }

    public String getSendCityCode() {
        return SendCityCode;
    }

    public void setSendCityCode(String sendCityCode) {
        SendCityCode = sendCityCode;
    }

    public String getSendAddressee() {
        return SendAddressee;
    }

    public void setSendAddressee(String sendAddressee) {
        SendAddressee = sendAddressee;
    }

    public String getSendName() {
        return SendName;
    }

    public void setSendName(String sendName) {
        SendName = sendName;
    }

    public String getSendMobile() {
        return SendMobile;
    }

    public void setSendMobile(String sendMobile) {
        SendMobile = sendMobile;
    }
}
