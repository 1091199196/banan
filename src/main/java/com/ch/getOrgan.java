package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;

public class getOrgan {

    private static String GET_ORGAN= "/getRegionItemOrgList";

    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(GET_ORGAN);
        JSONObject json = new JSONObject();
        // json.put("formId", "JiaoWeiXinXiBiao1");
        /**  保存业务*/
        //request.setParams(json.toString());
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
