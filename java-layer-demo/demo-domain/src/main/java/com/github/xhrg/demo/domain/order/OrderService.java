package com.github.xhrg.demo.domain.order;

import com.github.xhrg.demo.basic.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public String query() {
        String order = orderMapper.query();
        String resultOrder = order + "domain层加了业务进去";
        return resultOrder;
    }

}
