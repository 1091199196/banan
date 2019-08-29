package com.parse;

import com.aep.cloud.json.JSONObject;

public class submitFormParse {

    public static void parse(String str) {
        if (str == null || str == "") {
            str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"dataId\\\\\\\":\\\\\\\"20190805160040100800\\\\\\\",\\\\\\\"state\\\\\\\":\\\\\\\"200\\\\\\\"}\\\",\\\"status\\\":200}\",\"signature\":\"b84d08b0b0dfd597c6fbf53196af7668\"}\n";
        }
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
        String receiveNum = (String) rootObject2.get("dataId");
        System.out.println(receiveNum);
    }

    public static void main(String[] args) {
        parse("");
    }
}
