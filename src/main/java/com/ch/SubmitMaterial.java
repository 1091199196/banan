package com.ch;

import com.aep.cloud.AepCloudClient;
import com.aep.cloud.client.AepClient;
import com.aep.cloud.client.request.AepRequest;
import com.aep.cloud.client.response.AepResponse;
import com.aep.cloud.http.MethodType;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class SubmitMaterial {


    private static String SUBMIT_MATERIAL = "/upload";

    public static void main(String args[]) {
        String appKey = "604355826060099584";
        String appSecret = "7aec0127fcf04cfab751cec717446f65";
        // String formId = "JiaoWeiXinXiBiao1";
        AepClient aepClient = new AepCloudClient("http://ykb.cq.gov.cn:18021/api/", appKey, appSecret);
        AepRequest request = new AepRequest();
        request.method(MethodType.POST);
        request.setApiUrl(SUBMIT_MATERIAL);
        Map<String,Object> map = new HashMap<>();
        JSONObject json = new JSONObject();
        /** 提交表单 */
      /*  json.put("uid","self");
        json.put("type","doc");
        json.put("folder_name","baNanSelf");
        json.put("file_url","C:\\Users\\86187\\Desktop\\aaa.jpg");
        json.put("server_url","http://rcservice.iop.com/upload");*/
        map.put("uid","self");
        map.put("type","doc");
        map.put("folder_name","baNanSelf");
        File file = new File("C:\\Users\\86187\\Desktop\\aaa.jpg");
        map.put("file_url" , file);
        map.put("server_url","http://23.99.127.113:8084/upload");
        /**  保存业务*/
       // request.setParams();
        //request.
        try {
            AepResponse response = aepClient.execute(request);
            System.out.print(response.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
