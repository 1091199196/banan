package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;

public class test {

    // 业务保存
    private static String SUBMIT_OPERTION = "/icity/c/api.server/executeCs1";

    //获取表单
    private static String GET_FORM = "/inspur/getFormInfo";

    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        String pagemode = "chongqing";
        String action = "tempStorage";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret/*,pagemode,action*/);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(GET_FORM);
        JSONObject json = new JSONObject();
        /**  获取表单 */
          //json.put("itemId", "98c3c8a5-8135-49d5-900c-ad3abf623b47");
          json.put("itemId", "19722c4a-b9f6-46b1-ba95-ab7912151164");
        /**  保存业务*/
      /*  json.put("ID", "554462542533");
        json.put("ItemCode", "0118549000-500113000000733958814004");
        json.put("ItemID","8e89ce9c-bf47-4e24-bdec-63cf540bf99a");
        json.put("Status","00");*/
        /*json.put("pagemode","chongqing");
        json.put("action","tempStorage");*/
        request.setParams(json.toString());
        try {
            AepResponse response = aepClient.execute(request);
             test2.splitTo(response.getData().toString());
             // test3.json(response.getData().toString());
           // test2.splitTo(response.getData().toString());
            System.out.print(response.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
