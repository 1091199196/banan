package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;

public class getOrganServiceInfo {
    private static String GET_ORGAN_SERVICE_INFO = "/getRegionItemByPage";

    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(GET_ORGAN_SERVICE_INFO);
        JSONObject json = new JSONObject();
        json.put("page", "1");
        json.put("rows", "100");
        json.put("orgCode","5001080501");
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
