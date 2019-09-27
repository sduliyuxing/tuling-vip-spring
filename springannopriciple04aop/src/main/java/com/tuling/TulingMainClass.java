package com.tuling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by smlz on 2019/6/10.
 */
@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAspectJAutoProxy(exposeProxy = true)
@ComponentScan(basePackages = {"com.tuling"})
public class TulingMainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TulingMainClass.class);
//        Calculate calculate = ctx.getBean(Calculate.class);
//        calculate.mod(3,4);
//        calculate.mod(4,3);
        OrderService orderService=ctx.getBean(OrderService.class);
//        orderService.queryOrder(null);
        orderService.createOrder("1","2");
//        calculate.add(3,4);
    }
}
