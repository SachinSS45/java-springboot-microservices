package com.sachin;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrderService {

    public OrderService() {
        System.out.println("OrderService Created");
    }

    public void placeOrder(){
        System.out.println("Order placed");
    }
}
