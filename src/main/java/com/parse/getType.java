package com.parse;

public enum getType {
    正常("01", "正常"),
    不予受理("02", "不予受理"),
    预审撤销("03", "预审撤销"),
    待预审("11", "待预审"),
    预审通过("12", "预审通过"),
    预审撤销2("13", "预审撤销"),
    预审驳回("14", "预审驳回"),
    并联业务补齐("15", "并联业务补齐"),
    预审通过2("16", "预审通过"),
    补齐补正("21", "补齐补正"),
    挂起("23", "挂起"),
    收费挂起("24", "收费挂起"),
    挂起2("25", "挂起"),
    待预审2("26", "待预审"),
    上报("27", "上报"),
    退回("28", "退回"),
    申请退件("95", "申请退件"),
    退件("96", "退件"),
    作废("97", "作废"),
    不予许可("98", "不予许可"),
    准许许可("99", "准许许可");

    private String type;
    private String result;

    @Override
    public String toString() {
        return "getType{" +
                "type='" + type + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    getType(String type, String result) {
        this.type = type;
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static String getResult(String type) {
        for (getType getType : getType.values()) {
            if (getType.getType().equals(type)) {
                return getType.getResult();
            }
        }
        return null;
    }
}
