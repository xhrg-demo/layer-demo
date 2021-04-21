package com.github.xhrg.demo.api.http;

import com.github.xhrg.demo.app.facade.OrderFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class HttpOrderAction {

    private final static Logger log = LoggerFactory.getLogger(HttpOrderAction.class);

    @Autowired
    private OrderFacade orderFacade;

    @RequestMapping("/query")
    public Object query() {
        log.info("order/query");
        return orderFacade.query();
    }
}
