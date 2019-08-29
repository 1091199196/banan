package com.pojo;

import com.aep.cloud.json.JSONObject;
import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

public class JsonUtil {

    public static void jsonOperation(String str) {
        //String str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"code\\\\\\\":\\\\\\\"200\\\\\\\",\\\\\\\"info\\\\\\\":{\\\\\\\"formField\\\\\\\":[{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"JiGouMingChen\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"机构名称\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"BanXueChangDi\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"办学场地\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"JuBanZhe\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"举办者\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"BanXueNaRong\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"办学内容\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"}],\\\\\\\"formId\\\\\\\":\\\\\\\"JiaoWeiXinXiBiao1\\\\\\\",\\\\\\\"formName\\\\\\\":\\\\\\\"教委信息表1\\\\\\\",\\\\\\\"isSetUp\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"objectType\\\\\\\":\\\\\\\"1\\\\\\\"}}\\\",\\\"status\\\":200}\",\"signature\":\"e01c34f853ab9abc26a0303cab9d6d36\"}\n";
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
      //  Map maps = (Map) JSON.parse(rootObject2.get("info").toString());
        String tempId = (String)rootObject2.get("tempId");
        String code = (String)rootObject2.get("code");
        String message =(String) rootObject2.get("message");
        System.out.println(tempId + code + message);
        System.out.println();
    }
}
