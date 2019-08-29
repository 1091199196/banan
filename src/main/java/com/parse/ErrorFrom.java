package com.parse;

import com.aep.cloud.json.JSONObject;

public class ErrorFrom {
    public static void main(String[] args) {
        String str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"code\\\\\\\":\\\\\\\"300\\\\\\\",\\\\\\\"error\\\\\\\":\\\\\\\"此事项(f7fa1c97-1ebf-4dfb-a33b-03cbf5484881)未配置表单信息！\\\\\\\"}\\\",\\\"status\\\":200}\",\"signature\":\"9097fac4ee5694416659c2c4279c9635\"}\n";
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
        if (rootObject2.toString().contains("error")) {
            if (rootObject2.toString().contains("未配置")) {
                System.out.println("没有表单");
                return;
            }
        }
        String receiveNum = (String) rootObject2.get("dataId");
        System.out.println(receiveNum);
    }
}
