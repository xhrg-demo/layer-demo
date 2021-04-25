package com.github.xhrg.demo.api.config;

public class Response {

    //状态代码。1=正常。2=异常不需要处理,3=异常需要处理。
    private int code;
    private Object data;
    private String msg;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}