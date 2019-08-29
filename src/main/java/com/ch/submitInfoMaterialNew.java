package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;
import com.pojo.*;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class submitInfoMaterialNew {

      /*  保存接口请求头：pagemode=chongqing&action=tempStorage
    提交接口请求头：pagemode=chongqing&action=submitBusiness*/

    private static String SUBMIT_MATERIAL = "/web/approval/accpet";

    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(SUBMIT_MATERIAL);
        JSONObject json = new JSONObject();
        List<Metail> metails = new ArrayList<Metail>(6);

        Metail metail1 = new Metail();
        metail1.setDOCUMENT_ID("8D419F4E49174EA49A9A6BCBDA3B99D1");
        metail1.setDOCUMENT_NAME("办理结果材料");
        metail1.setFILE_NAME("aaa.jpg");
        metail1.setFILE_PATH(null);
        metail1.setTYPE("1");
        metails.add(metail1);
        Metail metail2 = new Metail();
        metail2.setDOCUMENT_ID("A45C7B4E3512483AA1012205F0DD6DF0");
        metail2.setDOCUMENT_NAME("办理结果材料");
        metail2.setFILE_NAME("aaa.jpg");
        metail2.setFILE_PATH(null);
        metail2.setTYPE("1");
        metails.add(metail2);


        ResponseInfoNew responseInfoNew = new ResponseInfoNew();
        responseInfoNew.setDataId("");
        responseInfoNew.setFormId("ChengXiangJiMinSheHuiYangLaoBa");
        responseInfoNew.setMetail(metails);
        responseInfoNew.setUcid("8001");
        responseInfoNew.setObjectType("1");
        responseInfoNew.setItemId("8e89ce9c-bf47-4e24-bdec-63cf540bf99a");
        responseInfoNew.setItemCode("0118549000-500113000000733958814004");
        responseInfoNew.setItemName("食品经营许可注销");
        responseInfoNew.setOrgCode("5001130340");
        responseInfoNew.setOrgName("巴南区食药监分局");
        responseInfoNew.setRegionCode("410421000000");
        responseInfoNew.setRegionName("许昌市魏都区");
        responseInfoNew.setReceiveNum("");
        responseInfoNew.setState("sp");
        responseInfoNew.setAssort("1");
        responseInfoNew.setIsSetUp("0");
        responseInfoNew.setPassword("");
        ServiceList serviceList = new ServiceList();
        ReponseInfoPerson reponseInfoPerson = new ReponseInfoPerson();
        reponseInfoPerson.setHomeAddress("中梁山街道康苑社区");
        reponseInfoPerson.setIdcardNo("500107198708275320");
        reponseInfoPerson.setIdentityType("10");
        reponseInfoPerson.setName("刘晋妃");
        responseInfoNew.setInfo(reponseInfoPerson);
        serviceList.setSendType("0");
        responseInfoNew.setServiceList(serviceList);
      //  responseInfoNew.setTransferred("1");
        /*Info info = new Info();
        responseInfoNew.setInfo(info);*/
        String s = JSONObject.toJSONString(responseInfoNew);

//        JSONObject jsonObject = JSONObject.parseObject(responseInfoNew.toString());
        //json.put("")
        String aa = "{\"dataId\":\"\",\"formId\":\"ChengXiangJiMinSheHuiYangLaoBa\",\"metail\":[{\"FILE_PATH\":null,\"FILE_NAME\":\"户口本_132091268795987186_附件\",\"TYPE\":\"0\",\"DOCUMENT_ID\":\"8D419F4E49174EA49A9A6BCBDA3B99D1\",\"DOCUMENT_NAME\":\"户口本\"},{\"FILE_PATH\":null,\"FILE_NAME\":\"办理结果材料_132091268841539792_附件\",\"TYPE\":\"0\",\"DOCUMENT_ID\":\"A45C7B4E3512483AA1012205F0DD6DF0\",\"DOCUMENT_NAME\":\"办理结果材料\"}],\"zjhm\":\"372926199810283612\",\"sqrxm\":\"李重阳\",\"lxrxm\":\"李重阳\",\"lxrphone\":\"\",\"ucid\":\"8001\",\"info\":{},\"objectType\":\"1\",\"itemId\":\"6FC824440E9F49EE89E119BB9C43E59F\",\"itemCode\":\"0104804000-500113113010888888888888\",\"itemName\":\"重庆市巴南区城乡居民社会养老保险\",\"orgCode\":\"50011302\",\"orgName\":\"村委会\",\"regionCode\":\"410421000000\",\"regionName\":\"许昌市魏都区\",\"receiveNum\":\"\",\"password\":\"\",\"state\":\"sp\",\"assort\":\"1\",\"Transferred\":\"1\",\"servicelist \":{}}";
       String bb = "{\n" +
               "\t\"dataId\": \"\",\n" +
               "\t\"formId\": \"ChengXiangJiMinSheHuiYangLaoBa\",\n" +
               "\t\"metail\": [{\n" +
               "\t\t\"FILE_PATH\": null,\n" +
               "\t\t\"FILE_NAME\": \"户口本_132091268795987186_附件\",\n" +
               "\t\t\"TYPE\": \"0\",\n" +
               "\t\t\"DOCUMENT_ID\": \"8D419F4E49174EA49A9A6BCBDA3B99D1\",\n" +
               "\t\t\"DOCUMENT_NAME\": \"户口本\"\n" +
               "\t}, {\n" +
               "\t\t\"FILE_PATH\": null,\n" +
               "\t\t\"FILE_NAME\": \"办理结果材料_132091268841539792_附件\",\n" +
               "\t\t\"TYPE\": \"0\",\n" +
               "\t\t\"DOCUMENT_ID\": \"A45C7B4E3512483AA1012205F0DD6DF0\",\n" +
               "\t\t\"DOCUMENT_NAME\": \"办理结果材料\"\n" +
               "\t}],\n" +
               "\t\"ucid\": \"8001\",\n" +
               "\t\"info\": {},\n" +
               "\t\"objectType\": \"1\",\n" +
               "\t\"itemId\": \"6FC824440E9F49EE89E119BB9C43E59F\",\n" +
               "\t\"itemCode\": \"0104804000-500113113010888888888888\",\n" +
               "\t\"itemName\": \"重庆市巴南区城乡居民社会养老保险\",\n" +
               "\t\"orgCode\": \"50011302\",\n" +
               "\t\"orgName\": \"村委会\",\n" +
               "\t\"regionCode\": \"410421000000\",\n" +
               "\t\"regionName\": \"许昌市魏都区\",\n" +
               "\t\"receiveNum\": \"\",\n" +
               "\t\"password\": \"\",\n" +
               "\t\"state\": \"sp\",\n" +
               "\t\"assort\": \"1\",\n" +
               "\t\"Transferred\": \"1\",\n" +
               "\t\"servicelist \": {}\n" +
               "}";
        json.put("postdata", s);
        request.setParams(json.toString());
        try {
            AepResponse response = aepClient.execute(request);
            System.out.print(response.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
