package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;
import com.pojo.Metail;
import com.pojo.ResponseCompany;
import com.pojo.ResponseInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class submitInfoMaterial {

      /*  保存接口请求头：pagemode=chongqing&action=tempStorage
    提交接口请求头：pagemode=chongqing&action=submitBusiness*/

    private static String SUBMIT_MATERIAL = "/icity/c/api.server/executeCs";

    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        String pagemode = "chongqing";
        String action = "submitBusiness";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret,pagemode,action);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(SUBMIT_MATERIAL);
        JSONObject json = new JSONObject();
        List<Metail> metails = new ArrayList<Metail>(6);
        for (int i = 0; i < 5; i++) {
            Metail metail = new Metail();
            metail.setOPERATOR_NAME("祖万里");
            metail.setOPERATOR_ID("334D315E60984032B3FA3E613D34BDC1");
            metail.setDOCUMENT_ID("4456789");
            metail.setFILE_NAME("aaa.jpg");
            metail.setFILE_PATH("C:\\Users\\86187\\Desktop\\aaa.jpg\"");
            metail.setTYPE("1");
            metails.add(metail);
        }
        ResponseInfo responseInfo = new ResponseInfo();
        responseInfo.setPowerType("XK");
        responseInfo.setTempId("286de265fcbf447db46a87f887ed4edc");
        responseInfo.setState("sp");
        responseInfo.setItemId("8e89ce9c-bf47-4e24-bdec-63cf540bf99a");
        responseInfo.setItemCode("0118549000-500113000000733958814004");
        responseInfo.setItemName("食品经营许可注销");
        responseInfo.setOrgCode("5001130340");
        responseInfo.setOrgName("巴南区食药监分局");
        responseInfo.setObjectType("3");
        responseInfo.setFormId("JiaoWeiXinXiBiao1");
        responseInfo.setDataId("132132131");
        ResponseCompany responseCompany = new ResponseCompany();
        responseCompany.setOrgName("上海卓繁信息技术股份有限公司");
        responseCompany.setOrgCode("91310000729355068Q");
        responseCompany.setOrgType("牛逼组织");
        responseCompany.setLegalPerson("祖万里");
        responseCompany.setCertificateName("身份证");
        responseCompany.setCertificateNo("411424199308153312");
        responseCompany.setRegisterAddress("上海");
        responseCompany.setBusinessScope("很多很多的辣椒");
        responseCompany.setRegisterDate(new Date());
        responseCompany.setOrgActuality("经营良好");
        responseInfo.setInfo(responseCompany);
        responseInfo.setMetail(metails);
        /**  获取表单 */
    /*    json.put("powerType", "XK");
        json.put("tempId", "286de265fcbf447db46a87f887ed4edc");
        json.put("state", "sp");
        json.put("itemId", "8e89ce9c-bf47-4e24-bdec-63cf540bf99a");
        json.put("itemCode", "0118549000-500113000000733958814004");
        json.put("itemName", "食品经营许可注销");
        json.put("orgCode", "5001130340");
        json.put("orgName", "巴南区食药监分局");
        json.put("objectType", "1");
        json.put("dataId", "1");
        json.put("formId", "JiaoWeiXinXiBiao1");
        json.put("metail", metails);*/
        json.put("ID", "225130");
        /**  保存业务*/
        String ooo ="{\"receiveNum\":\"\",\n" +
                "\"tempId\":\"38f8ec6a0e014514b3e4be3d99bd7ee1\",\n" +
                "\"state\":\"sp\",\n" +
                "\"isSetUp\":\"\",\n" +
                "\"itemId\":\"C60427B6300D44FEB4C9D2683F4CE212\",\n" +
                "\"itemCode\":\"0107525021-50010300000009283916001\",\n" +
                "\"itemName\":\"内资公司设立登记\",\n" +
                "\"orgCode\":\"5001030300\",\n" +
                "\"orgName\":\"渝中区工商局\",\n" +
                "\"regionCode\":\"500103\",\n" +
                "\"regionName\":\"渝中区\",\n" +
                "\"powerType\":\"XK\",\n" +
                "\"objectType\":\"3\",\n" +
                "\"formId\":\"\",\n" +
                "\"dataId\":\"\",\n" +
                "\"metail\":[{\"OPERATOR_ID\":\"72008\",\n" +
                "\"OPERATOR_NAME\":\"吕泽超\",\n" +
                "\"DOCUMENT_ID\":\"\",\n" +
                "\"DOCUMENT_NAME\":\"\",\n" +
                "\"TYPE\":\"0\",\n" +
                "\"FILE_NAME\":\"\",\n" +
                "\"FILE_PATH\":\"\"}],\n" +
                "\"info\":{\"orgName\":\"重庆启拓商贸有限公司\",\n" +
                "\"orgCode\":\"\",\n" +
                "\"legalPerson\":\"sad\",\n" +
                "\"certificateName\":\"中华人民共和国居民身份证\",\n" +
                "\"certificateNo\":\"500225199506264746\",\n" +
                "\"registerAddress\":\"重庆市渝中区\",\n" +
                "\"businessScope\":\"销售：家用电器、五金交电、建材\",\n" +
                "\"registerDate\":\"\",\n" +
                "\"orgActuality\":\"存活\",\n" +
                "\"orgCodeAwardDate\":\"\",\n" +
                "\"orgCodeAwardOrg\":\"\",\n" +
                "\"orgCodeValidPeriodStart\":\"\",\n" +
                "\"orgCodeValidPeriodEnd_str\":\"\",\n" +
                "\"orgCodeValidPeriodEnd\":\"\",\n" +
                "\"orgEnglishName\":\"\",\n" +
                "\"orgType\":\"Enterprise\",\n" +
                "\"enterpriseSortCode\":\"\",\n" +
                "\"enterpriseSortName\":\"\",\n" +
                "\"enterpriseTypeCode\":\"\",\n" +
                "\"enterpriseTypeName\":\"\",\n" +
                "\"legalPersonType\":\"\",\n" +
                "\"responsiblePerson\":\"\",\n" +
                "\"responsiblePersonId\":\"\",\n" +
                "\"inAreaCode\":\"\",\n" +
                "\"inArea\":\"\",\n" +
                "\"chargeDepartment\":\"\",\n" +
                "\"produceAddress\":\"\",\n" +
                "\"mailingAddress\":\"\",\n" +
                "\"postalCode\":\"\",\n" +
                "\"linkMan\":\"\",\n" +
                "\"contactPhone\":\"\",\n" +
                "\"fax\":\"\",\n" +
                "\"linkManEmail\":\"\",\n" +
                "\"bank\":\"\",\n" +
                "\"bankAccount\":\"\",\n" +
                "\"organizationKind\":\"\",\n" +
                "\"employeeNum\":\"\",\n" +
                "\"registerCapital\":\"\",\n" +
                "\"currencyKind\":\"\",\n" +
                "\"groundArea\":\"\",\n" +
                "\"businessScopePart\":\"\",\n" +
                "\"mainProduct\":\"\",\n" +
                "\"operatingMode\":\"\",\n" +
                "\"orgFoundDate\":\"\",\n" +
                "\"businessLicense\":\"\",\n" +
                "\"aicAwardDate\":\"\",\n" +
                "\"aicValidPeriodStart\":\"\",\n" +
                "\"aicValidPeriodEnd\":\"\",\n" +
                "\"aicCertAwardOrg\":\"\",\n" +
                "\"taxManager\":\"\",\n" +
                "\"nationTaxRegisterNo\":\"\",\n" +
                "\"nationTaxAwardDate\":\"\",\n" +
                "\"locationTaxRegisterNo\":\"\",\n" +
                "\"locationTaxAwardDate\":\"\",\n" +
                "\"nationInvestRate\":\"\",\n" +
                "\"corporationInvestRate\":\"\",\n" +
                "\"foreignInvestRate\":\"\",\n" +
                "\"naturalManInvestRate\":\"\",\n" +
                "\"bankLoanRate\":\"\",\n" +
                "\"remark\":\"\"}}";
        json.put("PostData",ooo );
        request.setParams(json.toString());
        try {
            AepResponse response = aepClient.execute(request);
            System.out.print(response.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
