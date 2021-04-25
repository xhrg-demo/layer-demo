package com.github.xhrg.demo.api.config;

import com.github.xhrg.demo.basic.exception.BizException;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 说明：
 * 该类目前有2个作用，1是beforeBodyWrite，2是ExceptionHandler，这2个可以分开，也可以配置到一个接口中。
 */
@ControllerAdvice
public class MyResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {
        if (body instanceof Response) {
            return body;
        }
        Response resp = new Response();
        resp.setCode(ResponseState.SUCCESS_CODE.code());
        resp.setData(body);
        return resp;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(HttpServletRequest request, Exception ex) {
        Response resp = new Response();
        resp.setCode(ResponseState.SYS_ERROR_CODE.code());
        resp.setMsg(ex.getMessage());
        //2是不需要处理的异常，也就是业务异常。
        if (ex instanceof BizException) {
            resp.setCode(ResponseState.BIZ_ERROR_CODE.code());
        } else {
            ex.printStackTrace();
        }
        return resp;
    }
}