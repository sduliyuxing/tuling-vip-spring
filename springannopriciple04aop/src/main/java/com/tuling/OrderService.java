package com.tuling;

import org.springframework.stereotype.Component;

/**
 * @author yanshi
 */
@Component
public class OrderService {

    public Order createOrder(String username, String product) {
        Order order = new Order();
        order.setUsername(username);
        order.setProduct(product);
        return order;
    }

    public Order queryOrder(String username) {
        Order order = new Order();
        order.setUsername("test");
        order.setProduct("test");
        return order;
    }
}