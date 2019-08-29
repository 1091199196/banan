package com.pojo;

public class ReponseCompany {
    /**
     * 组织机构名称
     */
    private String orgName;

    /**
     * 组织机构代码
     */
    private String orgCode;

    /**
     * 组织机构类型
     */
    private String orgType;

    /**
     * 法定代表人
     */
    private String legalPerson;
    /**
     * 法人证件名称
     */
    private String certificateName;
    /**
     * 法人证件号码
     */
    private String certificateNo;

    /**
     * 单位注册地址
     */
    private String registerAddress;

    /**
     * 联系人
     */
    private String linkMan;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }
}
