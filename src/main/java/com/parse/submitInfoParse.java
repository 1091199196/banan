package com.parse;

import com.aep.cloud.json.JSONObject;
import com.alibaba.fastjson.JSON;

import java.util.Map;

public class submitInfoParse {

    public static void main(String[] args) {
        parese("");
    }

    public static void parese(String str) {
        if (str == null || str == "") {
            str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"receiveNum\\\\\\\":\\\\\\\"410421034000WZ20190802003621004004\\\\\\\",\\\\\\\"state\\\\\\\":\\\\\\\"200\\\\\\\"}\\\",\\\"status\\\":200}\",\"signature\":\"499b015415f3ee62eba6ca93ceb1c6d6\"}\n";
        }
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
        String receiveNum = (String) rootObject2.get("receiveNum");
        System.out.println(receiveNum);
    }
}
