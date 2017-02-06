package com.zeaho.base.jsonmodel;

/**
 * Created by xht on 2017/2/5.
 */
public class GcbJsonModel {
    private int code;
    private String message;
    private Object result;
    private String eTag;

    public GcbJsonModel(Object result) {
        this.result = result;
        this.code = GcbJsonCode.SUCCESS;
    }

    public GcbJsonModel(Object result, int code) {
        this.result = result;
        this.code = code;
    }

    public GcbJsonModel(Object result, int code, String message) {
        this.result = result;
        this.code = code;
        this.message = message;
    }

    public GcbJsonModel(Object result, int code, String message, String eTag) {
        this.result = result;
        this.code = code;
        this.message = message;
        this.eTag = eTag;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String geteTag() {
        return eTag;
    }

    public void seteTag(String eTag) {
        this.eTag = eTag;
    }
}
