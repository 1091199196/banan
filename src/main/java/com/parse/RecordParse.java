package com.parse;

import com.aep.cloud.json.JSONObject;
import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;

import static java.awt.SystemColor.info;

public class RecordParse {
    public static void splitTo(String str) {
        if (str == null || str == "") {
            str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"code\\\\\\\":\\\\\\\"200\\\\\\\",\\\\\\\"info\\\\\\\":[{\\\\\\\"ACTIVE\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"BSNUM\\\\\\\":\\\\\\\"500351-0300-XK-1553830659486-6601533\\\\\\\",\\\\\\\"CURRENT_NODE_ID\\\\\\\":\\\\\\\"sid-2D24B388-50C5-4A34-8D1D-7574F581ACFD\\\\\\\",\\\\\\\"CURRENT_NODE_NAME\\\\\\\":\\\\\\\"受理\\\\\\\",\\\\\\\"DATA_ID\\\\\\\":\\\\\\\"20190329111639329100\\\\\\\",\\\\\\\"FINISH_TIME\\\\\\\":1553830779000,\\\\\\\"FLOW_DEFINEID\\\\\\\":\\\\\\\"4431ce43-57d7-11e8-88f0-005056a83845\\\\\\\",\\\\\\\"FORM_ID\\\\\\\":\\\\\\\"cqsgsglj_gtbd\\\\\\\",\\\\\\\"ITEM_CODE\\\\\\\":\\\\\\\"500351-510300-XK-40\\\\\\\",\\\\\\\"ITEM_ID\\\\\\\":\\\\\\\"2B4A0569A83C4BFB88CD661D430E33E8\\\\\\\",\\\\\\\"ITEM_NAME\\\\\\\":\\\\\\\"个体工商户登记（含设立、变更、注销）（全市通用）\\\\\\\",\\\\\\\"LIMIT_TIME\\\\\\\":1554652800000,\\\\\\\"NODE_TYPE\\\\\\\":\\\\\\\"2\\\\\\\",\\\\\\\"OPINION\\\\\\\":\\\\\\\"注册登记文件、证件齐备，具备开业登记条件，同意报请核准。\\\\\\\",\\\\\\\"ORG_CODE\\\\\\\":\\\\\\\"5003510300\\\\\\\",\\\\\\\"ORG_NAME\\\\\\\":\\\\\\\"两江新区市场和质量监督管理局\\\\\\\",\\\\\\\"RECEIVE_TIME\\\\\\\":1553830515000,\\\\\\\"REGION_CODE\\\\\\\":\\\\\\\"500351\\\\\\\",\\\\\\\"REGION_NAME\\\\\\\":\\\\\\\"两江新区\\\\\\\",\\\\\\\"SEND_TIME\\\\\\\":1553830515000,\\\\\\\"STATUS\\\\\\\":\\\\\\\"01\\\\\\\",\\\\\\\"USER_CODE\\\\\\\":\\\\\\\"34D7878FCECA49B59C2381F79E2F56C9\\\\\\\",\\\\\\\"USER_NAME\\\\\\\":\\\\\\\"易立\\\\\\\"},{\\\\\\\"ACTIVE\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"BSNUM\\\\\\\":\\\\\\\"500351-0300-XK-1553830659486-6601533\\\\\\\",\\\\\\\"CURRENT_NODE_ID\\\\\\\":\\\\\\\"sid-ABF0BC8C-FB17-4E87-B52F-BDC6C2270492\\\\\\\",\\\\\\\"CURRENT_NODE_NAME\\\\\\\":\\\\\\\"核准\\\\\\\",\\\\\\\"DATA_ID\\\\\\\":\\\\\\\"20190329111639329100\\\\\\\",\\\\\\\"FINISH_TIME\\\\\\\":1553830779000,\\\\\\\"FLOW_DEFINEID\\\\\\\":\\\\\\\"4431ce43-57d7-11e8-88f0-005056a83845\\\\\\\",\\\\\\\"FORM_ID\\\\\\\":\\\\\\\"cqsgsglj_gtbd\\\\\\\",\\\\\\\"ITEM_CODE\\\\\\\":\\\\\\\"500351-510300-XK-40\\\\\\\",\\\\\\\"ITEM_ID\\\\\\\":\\\\\\\"2B4A0569A83C4BFB88CD661D430E33E8\\\\\\\",\\\\\\\"ITEM_NAME\\\\\\\":\\\\\\\"个体工商户登记（含设立、变更、注销）（全市通用）\\\\\\\",\\\\\\\"NODE_TYPE\\\\\\\":\\\\\\\"2\\\\\\\",\\\\\\\"OPINION\\\\\\\":\\\\\\\"同意个体设立。\\\\\\\",\\\\\\\"ORG_CODE\\\\\\\":\\\\\\\"5003510300\\\\\\\",\\\\\\\"ORG_NAME\\\\\\\":\\\\\\\"两江新区市场和质量监督管理局\\\\\\\",\\\\\\\"RECEIVE_TIME\\\\\\\":1553830515000,\\\\\\\"REGION_CODE\\\\\\\":\\\\\\\"500351\\\\\\\",\\\\\\\"REGION_NAME\\\\\\\":\\\\\\\"两江新区\\\\\\\",\\\\\\\"SEND_TIME\\\\\\\":1553830569000,\\\\\\\"STATUS\\\\\\\":\\\\\\\"01\\\\\\\",\\\\\\\"USER_CODE\\\\\\\":\\\\\\\"3663DAF8C6EC4263A5BEA81B20670379\\\\\\\",\\\\\\\"USER_NAME\\\\\\\":\\\\\\\"蔡堃\\\\\\\"},{\\\\\\\"ACTIVE\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"BSNUM\\\\\\\":\\\\\\\"500351-0300-XK-1553830659486-6601533\\\\\\\",\\\\\\\"CURRENT_NODE_ID\\\\\\\":\\\\\\\"sid-983C4DA1-B72E-40CC-AD41-AC525D0A4AB5\\\\\\\",\\\\\\\"CURRENT_NODE_NAME\\\\\\\":\\\\\\\"已办结\\\\\\\",\\\\\\\"DATA_ID\\\\\\\":\\\\\\\"20190329111639329100\\\\\\\",\\\\\\\"FINISH_TIME\\\\\\\":1553830779000,\\\\\\\"FLOW_DEFINEID\\\\\\\":\\\\\\\"4431ce43-57d7-11e8-88f0-005056a83845\\\\\\\",\\\\\\\"FORM_ID\\\\\\\":\\\\\\\"cqsgsglj_gtbd\\\\\\\",\\\\\\\"ITEM_CODE\\\\\\\":\\\\\\\"500351-510300-XK-40\\\\\\\",\\\\\\\"ITEM_ID\\\\\\\":\\\\\\\"2B4A0569A83C4BFB88CD661D430E33E8\\\\\\\",\\\\\\\"ITEM_NAME\\\\\\\":\\\\\\\"个体工商户登记（含设立、变更、注销）（全市通用）\\\\\\\",\\\\\\\"NODE_TYPE\\\\\\\":\\\\\\\"2\\\\\\\",\\\\\\\"OPINION\\\\\\\":\\\\\\\"已经打印\\\\\\\",\\\\\\\"ORG_CODE\\\\\\\":\\\\\\\"5003510300\\\\\\\",\\\\\\\"ORG_NAME\\\\\\\":\\\\\\\"两江新区市场和质量监督管理局\\\\\\\",\\\\\\\"RECEIVE_TIME\\\\\\\":1553830569000,\\\\\\\"REGION_CODE\\\\\\\":\\\\\\\"500351\\\\\\\",\\\\\\\"REGION_NAME\\\\\\\":\\\\\\\"两江新区\\\\\\\",\\\\\\\"SEND_TIME\\\\\\\":1553830779000,\\\\\\\"STATUS\\\\\\\":\\\\\\\"99\\\\\\\",\\\\\\\"USER_CODE\\\\\\\":\\\\\\\"34D7878FCECA49B59C2381F79E2F56C9\\\\\\\",\\\\\\\"USER_NAME\\\\\\\":\\\\\\\"易立\\\\\\\"}]}\\\",\\\"status\\\":200}\",\"signature\":\"d4158a09e43599742c5218921f3595f5\"}\n";
        }
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
        JSONObject jsonObject3 = new JSONObject(rootObject2.toString());
        List list = (List) JSON.parse(jsonObject3.get("info").toString());
    }

    public static void main(String[] args) {
        splitTo("");
    }
}
