package com.github.xhrg.demo.api.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class HttpOrderAction {

    @RequestMapping("/query")
    public Object query() {
        return "query";
    }
}
