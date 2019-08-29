package com.saveMaterial;

public class saveMaterial {

    public static void main(String[] args) {

        saveMaterial();
    }

    public static void saveMaterial() {

        try {
            String s = httpUtil.sendMaterial("http://ykb.cq.gov.cn:18021/api/upload");
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
