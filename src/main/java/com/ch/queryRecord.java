package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;
import com.parse.RecordParse;

public class queryRecord {
    private  static  String QUERY_RECORD = "/web/approval/getBusinessInfo";
    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        String formId = "JiaoWeiXinXiBiao1";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(QUERY_RECORD);
        JSONObject json = new JSONObject();
        // json.put("formId", "JiaoWeiXinXiBiao1");
        json.put("receiveNumber","5003510300XKCK20190329005428000129");
        /**  保存业务*/
        request.setParams(json.toString());
        try {
            AepResponse response = aepClient.execute(request);
           // RecordParse.splitTo(response.getData().toString());
            //test2.splitTo(response.getData().toString());
            // test3.json(response.getData().toString());
            // test2.splitTo(response.getData().toString());
            System.out.print(response.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
