package com.github.xhrg.demo.api.config;

public enum ResponseState {

    SYS_ERROR_CODE(1000, "system_error"),
    SUCCESS_CODE(2000, "success"),
    BIZ_ERROR_CODE(3000, "biz_error");

    private final int code;

    private final String state;

    ResponseState(int code, String state) {
        this.code = code;
        this.state = state;
    }

    public int code() {
        return this.code;
    }

    public String state() {
        return this.state;
    }

}
