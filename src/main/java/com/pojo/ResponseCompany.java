package com.pojo;

import java.util.Date;

public class ResponseCompany {

    /**
     * 组织机构名称(必填) varchar(100)
     */
    private String orgName;

    /**
     * 组织机构代码(必填) varchar(20)
     */
    private String orgCode;

    // 组织机构代码证发证日期
    private String orgCodeAwardDate;
    // 组织机构代码发证机构
    private String orgCodeAwardOrg;
    // 组织机构代码证有效期起 datetime
    private Date orgCodeValidPeriodStart;
    // 组织机构代码证有效期止 datetime
    private Date orgCodeValidPeriodEnd_str;
    private String orgCodeValidPeriodEnd;
    // 机构英文名称 varchar(100)
    private String orgEnglishName;
    // 组织机构类型 varchar(50) 不能为空
    private String orgType;
    // 企业类别代码 varchar(5) 根据国家工商总局2007年9月30日发布的《gs 1-2007企业信用分类监管数据规范》中“b.10 ca16
    // 企业(机构)类型代码”：1000
    private String enterpriseSortCode;
    // 企业类别名称
    private String enterpriseSortName;
    //	法定代表人	varchar(50)	不能为空
    private String legalPerson;
    //	法人证件名称	varchar(20)	不能为空
    private String certificateName;
    //	法人证件号码	varchar(20)	不能为空
    private String certificateNo;
    //单位注册地址	varchar(200)
    private String registerAddress;
    //	经营(生产)范围(主营）	varchar(1500)	不能为空
    private String businessScope;
    //	登记注册日期	date	不能为空
    private Date registerDate;
    //	组织机构现状	varchar(10)	不能为空
    private String orgActuality;

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

    public String getOrgCodeAwardDate() {
        return orgCodeAwardDate;
    }

    public void setOrgCodeAwardDate(String orgCodeAwardDate) {
        this.orgCodeAwardDate = orgCodeAwardDate;
    }

    public String getOrgCodeAwardOrg() {
        return orgCodeAwardOrg;
    }

    public void setOrgCodeAwardOrg(String orgCodeAwardOrg) {
        this.orgCodeAwardOrg = orgCodeAwardOrg;
    }

    public Date getOrgCodeValidPeriodStart() {
        return orgCodeValidPeriodStart;
    }

    public void setOrgCodeValidPeriodStart(Date orgCodeValidPeriodStart) {
        this.orgCodeValidPeriodStart = orgCodeValidPeriodStart;
    }

    public Date getOrgCodeValidPeriodEnd_str() {
        return orgCodeValidPeriodEnd_str;
    }

    public void setOrgCodeValidPeriodEnd_str(Date orgCodeValidPeriodEnd_str) {
        this.orgCodeValidPeriodEnd_str = orgCodeValidPeriodEnd_str;
    }

    public String getOrgCodeValidPeriodEnd() {
        return orgCodeValidPeriodEnd;
    }

    public void setOrgCodeValidPeriodEnd(String orgCodeValidPeriodEnd) {
        this.orgCodeValidPeriodEnd = orgCodeValidPeriodEnd;
    }

    public String getOrgEnglishName() {
        return orgEnglishName;
    }

    public void setOrgEnglishName(String orgEnglishName) {
        this.orgEnglishName = orgEnglishName;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getEnterpriseSortCode() {
        return enterpriseSortCode;
    }

    public void setEnterpriseSortCode(String enterpriseSortCode) {
        this.enterpriseSortCode = enterpriseSortCode;
    }

    public String getEnterpriseSortName() {
        return enterpriseSortName;
    }

    public void setEnterpriseSortName(String enterpriseSortName) {
        this.enterpriseSortName = enterpriseSortName;
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

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getOrgActuality() {
        return orgActuality;
    }

    public void setOrgActuality(String orgActuality) {
        this.orgActuality = orgActuality;
    }
}
