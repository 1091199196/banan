package com.pojo;

public class Metail {
    private String OPERATOR_NAME;
    private String OPERATOR_ID;
    // 可以为null
    private String DOCUMENT_ID;
    //可以为null
    private String DOCUMENT_NAME;
    private String TYPE;
    private String FILE_NAME;
    private String FILE_PATH;

    public String getOPERATOR_ID() {
        return OPERATOR_ID;
    }

    public void setOPERATOR_ID(String OPERATOR_ID) {
        this.OPERATOR_ID = OPERATOR_ID;
    }

    public String getDOCUMENT_ID() {
        return DOCUMENT_ID;
    }

    public void setDOCUMENT_ID(String DOCUMENT_ID) {
        this.DOCUMENT_ID = DOCUMENT_ID;
    }

    public String getDOCUMENT_NAME() {
        return DOCUMENT_NAME;
    }

    public void setDOCUMENT_NAME(String DOCUMENT_NAME) {
        this.DOCUMENT_NAME = DOCUMENT_NAME;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public void setFILE_NAME(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME;
    }

    public String getFILE_PATH() {
        return FILE_PATH;
    }

    public void setFILE_PATH(String FILE_PATH) {
        this.FILE_PATH = FILE_PATH;
    }

    public String getOPERATOR_NAME() {
        return OPERATOR_NAME;
    }

    public void setOPERATOR_NAME(String OPERATOR_NAME) {
        this.OPERATOR_NAME = OPERATOR_NAME;
    }
}
