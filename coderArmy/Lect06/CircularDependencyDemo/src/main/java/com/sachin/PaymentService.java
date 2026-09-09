package com.sachin;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private final OrderService orderService;

    public PaymentService(OrderService orderService){
        this.orderService=orderService;
    }
    public void pay(){
        System.out.println("Payment done");
        orderService.getOrderDetails();
    }
}
