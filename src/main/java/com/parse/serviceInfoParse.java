package com.parse;

import com.aep.cloud.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.pojo.Info;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class serviceInfoParse {
    public static void splitTo(String str) {
        if (str == null || str == "") {
            str = "{\"code\":200,\"data\":\"{\\\"code\\\":1,\\\"msg\\\":\\\"ok\\\",\\\"data\\\":\\\"{\\\\\\\"code\\\\\\\":\\\\\\\"200\\\\\\\",\\\\\\\"info\\\\\\\":[{\\\\\\\"ACTIVE\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"BSNUM\\\\\\\":\\\\\\\"500351-0300-XK-1553830659486-6601533\\\\\\\",\\\\\\\"CURRENT_NODE_ID\\\\\\\":\\\\\\\"sid-2D24B388-50C5-4A34-8D1D-7574F581ACFD\\\\\\\",\\\\\\\"CURRENT_NODE_NAME\\\\\\\":\\\\\\\"受理\\\\\\\",\\\\\\\"DATA_ID\\\\\\\":\\\\\\\"20190329111639329100\\\\\\\",\\\\\\\"FINISH_TIME\\\\\\\":1553830779000,\\\\\\\"FLOW_DEFINEID\\\\\\\":\\\\\\\"4431ce43-57d7-11e8-88f0-005056a83845\\\\\\\",\\\\\\\"FORM_ID\\\\\\\":\\\\\\\"cqsgsglj_gtbd\\\\\\\",\\\\\\\"ITEM_CODE\\\\\\\":\\\\\\\"500351-510300-XK-40\\\\\\\",\\\\\\\"ITEM_ID\\\\\\\":\\\\\\\"2B4A0569A83C4BFB88CD661D430E33E8\\\\\\\",\\\\\\\"ITEM_NAME\\\\\\\":\\\\\\\"个体工商户登记（含设立、变更、注销）（全市通用）\\\\\\\",\\\\\\\"LIMIT_TIME\\\\\\\":1554652800000,\\\\\\\"NODE_TYPE\\\\\\\":\\\\\\\"2\\\\\\\",\\\\\\\"OPINION\\\\\\\":\\\\\\\"注册登记文件、证件齐备，具备开业登记条件，同意报请核准。\\\\\\\",\\\\\\\"ORG_CODE\\\\\\\":\\\\\\\"5003510300\\\\\\\",\\\\\\\"ORG_NAME\\\\\\\":\\\\\\\"两江新区市场和质量监督管理局\\\\\\\",\\\\\\\"RECEIVE_TIME\\\\\\\":1553830515000,\\\\\\\"REGION_CODE\\\\\\\":\\\\\\\"500351\\\\\\\",\\\\\\\"REGION_NAME\\\\\\\":\\\\\\\"两江新区\\\\\\\",\\\\\\\"SEND_TIME\\\\\\\":1553830515000,\\\\\\\"STATUS\\\\\\\":\\\\\\\"01\\\\\\\",\\\\\\\"USER_CODE\\\\\\\":\\\\\\\"34D7878FCECA49B59C2381F79E2F56C9\\\\\\\",\\\\\\\"USER_NAME\\\\\\\":\\\\\\\"易立\\\\\\\"},{\\\\\\\"ACTIVE\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"BSNUM\\\\\\\":\\\\\\\"500351-0300-XK-1553830659486-6601533\\\\\\\",\\\\\\\"CURRENT_NODE_ID\\\\\\\":\\\\\\\"sid-ABF0BC8C-FB17-4E87-B52F-BDC6C2270492\\\\\\\",\\\\\\\"CURRENT_NODE_NAME\\\\\\\":\\\\\\\"核准\\\\\\\",\\\\\\\"DATA_ID\\\\\\\":\\\\\\\"20190329111639329100\\\\\\\",\\\\\\\"FINISH_TIME\\\\\\\":1553830779000,\\\\\\\"FLOW_DEFINEID\\\\\\\":\\\\\\\"4431ce43-57d7-11e8-88f0-005056a83845\\\\\\\",\\\\\\\"FORM_ID\\\\\\\":\\\\\\\"cqsgsglj_gtbd\\\\\\\",\\\\\\\"ITEM_CODE\\\\\\\":\\\\\\\"500351-510300-XK-40\\\\\\\",\\\\\\\"ITEM_ID\\\\\\\":\\\\\\\"2B4A0569A83C4BFB88CD661D430E33E8\\\\\\\",\\\\\\\"ITEM_NAME\\\\\\\":\\\\\\\"个体工商户登记（含设立、变更、注销）（全市通用）\\\\\\\",\\\\\\\"NODE_TYPE\\\\\\\":\\\\\\\"2\\\\\\\",\\\\\\\"OPINION\\\\\\\":\\\\\\\"同意个体设立。\\\\\\\",\\\\\\\"ORG_CODE\\\\\\\":\\\\\\\"5003510300\\\\\\\",\\\\\\\"ORG_NAME\\\\\\\":\\\\\\\"两江新区市场和质量监督管理局\\\\\\\",\\\\\\\"RECEIVE_TIME\\\\\\\":1553830515000,\\\\\\\"REGION_CODE\\\\\\\":\\\\\\\"500351\\\\\\\",\\\\\\\"REGION_NAME\\\\\\\":\\\\\\\"两江新区\\\\\\\",\\\\\\\"SEND_TIME\\\\\\\":1553830569000,\\\\\\\"STATUS\\\\\\\":\\\\\\\"01\\\\\\\",\\\\\\\"USER_CODE\\\\\\\":\\\\\\\"3663DAF8C6EC4263A5BEA81B20670379\\\\\\\",\\\\\\\"USER_NAME\\\\\\\":\\\\\\\"蔡堃\\\\\\\"},{\\\\\\\"ACTIVE\\\\\\\":\\\\\\\"0\\\\\\\",\\\\\\\"BSNUM\\\\\\\":\\\\\\\"500351-0300-XK-1553830659486-6601533\\\\\\\",\\\\\\\"CURRENT_NODE_ID\\\\\\\":\\\\\\\"sid-983C4DA1-B72E-40CC-AD41-AC525D0A4AB5\\\\\\\",\\\\\\\"CURRENT_NODE_NAME\\\\\\\":\\\\\\\"已办结\\\\\\\",\\\\\\\"DATA_ID\\\\\\\":\\\\\\\"20190329111639329100\\\\\\\",\\\\\\\"FINISH_TIME\\\\\\\":1553830779000,\\\\\\\"FLOW_DEFINEID\\\\\\\":\\\\\\\"4431ce43-57d7-11e8-88f0-005056a83845\\\\\\\",\\\\\\\"FORM_ID\\\\\\\":\\\\\\\"cqsgsglj_gtbd\\\\\\\",\\\\\\\"ITEM_CODE\\\\\\\":\\\\\\\"500351-510300-XK-40\\\\\\\",\\\\\\\"ITEM_ID\\\\\\\":\\\\\\\"2B4A0569A83C4BFB88CD661D430E33E8\\\\\\\",\\\\\\\"ITEM_NAME\\\\\\\":\\\\\\\"个体工商户登记（含设立、变更、注销）（全市通用）\\\\\\\",\\\\\\\"NODE_TYPE\\\\\\\":\\\\\\\"2\\\\\\\",\\\\\\\"OPINION\\\\\\\":\\\\\\\"已经打印\\\\\\\",\\\\\\\"ORG_CODE\\\\\\\":\\\\\\\"5003510300\\\\\\\",\\\\\\\"ORG_NAME\\\\\\\":\\\\\\\"两江新区市场和质量监督管理局\\\\\\\",\\\\\\\"RECEIVE_TIME\\\\\\\":1553830569000,\\\\\\\"REGION_CODE\\\\\\\":\\\\\\\"500351\\\\\\\",\\\\\\\"REGION_NAME\\\\\\\":\\\\\\\"两江新区\\\\\\\",\\\\\\\"SEND_TIME\\\\\\\":1553830779000,\\\\\\\"STATUS\\\\\\\":\\\\\\\"99\\\\\\\",\\\\\\\"USER_CODE\\\\\\\":\\\\\\\"34D7878FCECA49B59C2381F79E2F56C9\\\\\\\",\\\\\\\"USER_NAME\\\\\\\":\\\\\\\"易立\\\\\\\"}]}\\\",\\\"status\\\":200}\",\"signature\":\"d4158a09e43599742c5218921f3595f5\"}\n";
        }
        JSONObject rootObject = new JSONObject(str);
        JSONObject rootObject1 = new JSONObject((String) rootObject.get("data"));
        JSONObject rootObject2 = new JSONObject((String) rootObject1.get("data"));
        JSONObject jsonObject3 = new JSONObject(rootObject2.toString());
        String itemInfo1 = jsonObject3.get("ItemInfo").toString();
        //   Info itemInfo = JSON.parseObject(jsonObject3.get("ItemInfo").toString(), Info.class);
        List list = (List) JSON.parse(jsonObject3.get("ItemInfo").toString());
      /*  //设立依据
        List legalbasis = (List) JSON.parse(jsonObject3.get("legalbasis").toString());
        String legalbasis1 = getLegalbasis(legalbasis);
        //办理材料
        List material = (List) JSON.parse(jsonObject3.get("material").toString());
        String materials = getMaterial(material);*/


        String s = list.toString();
        System.out.println(list.get(0));
        Map map = (Map) list.get(0);
        System.out.println("事项名称" + map.get("EXERTION_CONTENT"));
        System.out.println("事项code " + map.get("NEW_CODE"));
        System.out.println("事项Oid " + map.get("ID"));
        System.out.println("举报电话" + map.get("CONSULT_PHONE"));
        System.out.println("咨询电话" + map.get("COMPLAIN_PHONE"));
        System.out.println("常见问题" + map.get("FAC"));
        System.out.println("办理主题" + map.get("TITLE_NAME"));
        System.out.println("是否收费" + map.get("IS_CHARGE"));
        System.out.println("部门编号" + map.get("ORG_CODE"));
        System.out.println("部门名称" + map.get("ORG_NAME"));
        //申请条件暂不处理

      /*  System.out.println("事项名称 EXERTION_CONTENT"+list.get(74));
        System.out.println("事项code NEW_CODE"+list.get(37));
        System.out.println("举报电话 COMPLAIN_PHONE"+list.get(150));
        System.out.println("办理条件 FAC"+list.get(152));
        System.out.println("办理主题 TITLE_NAME" +list.get(136));
        System.out.println("承诺时间" +list.get(0));
        System.out.println("是否收费IS_CHARGE" +list.get(39));
        System.out.println("FAQ" + list.get(162));
        System.out.println("外网地址 WEB_ADDRESS" + list.get(140));
        // 1企业 2 个人  3项目（不懂）
        System.out.println("服务对象 " + list.get(124));
        System.out.println("事项oid "+ list.get(16));*/
    }

    private static String getMaterial(List material) {
        List list = material;
        for (int i = 0; i < list.size(); i++) {
            String aa = "";
            Map map = (Map) list.get(i);
            aa = (String) map.get("FILENAME");
            //材料备注
            String remark = (String) map.get("REMARK");
            //材料编号
            String code = (String) map.get("CODE");
            //原材料
            String origin = (String) map.get("ORIGIN");
            //复印材料
            String copy = (String) map.get("COPY");
            //是否必须
            String mast = (String) map.get("MUST");
            //是否电子
            String electronic = (String) map.get("ELECTRONIC");

            System.out.println(aa);
        }
        return null;
    }

    public static String getLegalbasis(List legalbasis) {
        List list = legalbasis;
        List list2 = new ArrayList();
        String eq = "";
        for (int i = 0; i < list.size(); i++) {
            String aa = "";
            Map map = (Map) list.get(i);
            if (!eq.contains(map.get("NAME").toString())) {
                eq += map.get("NAME");
                aa += map.get("LAW_NAME");
                aa += map.get("TNAME");
                aa += map.get("TCONTENT");
                aa += map.get("LAW_NUMBER");
                aa += map.get("NAME");
                System.out.println(aa);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //splitTo("");
        String aa = "SDFSD,SDFSD;FSDAF";

        String[] split = aa.split(",|;");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
