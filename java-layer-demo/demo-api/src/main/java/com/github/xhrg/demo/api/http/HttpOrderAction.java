package com.github.xhrg.demo.api.http;

import com.github.xhrg.demo.app.facade.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class HttpOrderAction {

    @Autowired
    private OrderFacade orderFacade;

    @RequestMapping("/query")
    public Object query() {
        return orderFacade.query();
    }
}
