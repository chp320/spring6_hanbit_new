package com.example.shopping.s_0402_stereotype_annotation.service;

import com.example.shopping.s_0002_common.entity.Order;
import com.example.shopping.s_0402_stereotype_annotation.input.CartInput;
import com.example.shopping.s_0402_stereotype_annotation.input.OrderInput;

public interface OrderService {
    Order placeOrder(OrderInput orderInput, CartInput cartInput);
}
