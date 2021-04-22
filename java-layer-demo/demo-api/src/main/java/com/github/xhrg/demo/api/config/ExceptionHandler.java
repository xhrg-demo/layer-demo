package com.github.xhrg.demo.api.config;

import com.github.xhrg.demo.basic.exception.BizException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    public static int SUCCESS_CODE = 1;

    public static int BIZ_ERROR_CODE = 2;

    public static int SYS_ERROR_CODE = 3;

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(HttpServletRequest request, Exception ex) {
        Response resp = new Response();
        resp.setCode(SYS_ERROR_CODE);
        resp.setMsg(ex.getMessage());
        //2是不需要处理的异常，也就是业务异常。
        if (ex instanceof BizException) {
            resp.setCode(BIZ_ERROR_CODE);
        } else {
            ex.printStackTrace();
        }
        return resp;
    }
}