package com.sayan.orderservice.controller;

import com.sayan.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class OrderController {

    @PostMapping("/order")
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        return "Order Placed Successfully!";
    }
}
