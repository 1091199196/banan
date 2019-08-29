package com.ch;

import com.aep.cloud.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.pojo.Table;
import com.pojo.TableVo;

import java.util.List;
import java.util.Map;

public class test3 {

    public static void main(String[] args) {
        json();
        //splitTo();
    }

    public static void json() {
       String str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"code\\\\\\\":\\\\\\\"200\\\\\\\",\\\\\\\"info\\\\\\\":{\\\\\\\"formField\\\\\\\":[{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"JiGouMingChen\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"机构名称\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"BanXueChangDi\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"办学场地\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"JuBanZhe\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"举办者\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"BanXueNaRong\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"办学内容\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"}],\\\\\\\"formId\\\\\\\":\\\\\\\"JiaoWeiXinXiBiao1\\\\\\\",\\\\\\\"formName\\\\\\\":\\\\\\\"教委信息表1\\\\\\\",\\\\\\\"isSetUp\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"objectType\\\\\\\":\\\\\\\"1\\\\\\\"}}\\\",\\\"status\\\":200}\",\"signature\":\"e01c34f853ab9abc26a0303cab9d6d36\"}\n";
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
        Map maps = (Map) JSON.parse(rootObject2.get("info").toString());
        String formId = (String)maps.get("formId");
        List list = (List) maps.get("formField");
        for (int i = 0; i < list.size(); i++) {
            Table table = com.alibaba.fastjson.JSONObject.parseObject(list.get(i).toString(), Table.class);
            System.out.println(table);
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    public static void splitTo() {
        String str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"code\\\\\\\":\\\\\\\"200\\\\\\\",\\\\\\\"info\\\\\\\":{\\\\\\\"formField\\\\\\\":[{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"JiGouMingChen\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"机构名称\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"BanXueChangDi\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"办学场地\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"JuBanZhe\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"举办者\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"},{\\\\\\\"FIELD_ID\\\\\\\":\\\\\\\"BanXueNaRong\\\\\\\",\\\\\\\"FIELD_LENGTH\\\\\\\":100,\\\\\\\"FIELD_NAME\\\\\\\":\\\\\\\"办学内容\\\\\\\",\\\\\\\"FIELD_TYPE\\\\\\\":\\\\\\\"text\\\\\\\"}],\\\\\\\"formId\\\\\\\":\\\\\\\"JiaoWeiXinXiBiao1\\\\\\\",\\\\\\\"formName\\\\\\\":\\\\\\\"教委信息表1\\\\\\\",\\\\\\\"isSetUp\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"objectType\\\\\\\":\\\\\\\"1\\\\\\\"}}\\\",\\\"status\\\":200}\",\"signature\":\"e01c34f853ab9abc26a0303cab9d6d36\"}\n";
        Map maps = (Map) JSON.parse(str);
        Map map1 = (Map) JSON.parse(maps.get("data").toString());
        Map map2 = (Map) JSON.parse(map1.get("data").toString());
        List list = (List) map2.get("LIST");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).toString();
            Map map4 = (Map) JSON.parse(s);
            Map map = (Map) JSON.parse(map4.get("INDEX").toString());
            System.out.println(map.get("STATE"));
        }
    }

}
