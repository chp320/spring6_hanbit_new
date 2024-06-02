package com.example.shopping.s_0402_stereotype_annotation.service;

import com.example.shopping.s_0002_common.entity.Order;
import com.example.shopping.s_0402_stereotype_annotation.input.CartInput;
import com.example.shopping.s_0402_stereotype_annotation.input.OrderInput;
import com.example.shopping.s_0402_stereotype_annotation.repository.OrderItemRepository;
import com.example.shopping.s_0402_stereotype_annotation.repository.OrderRepository;
import com.example.shopping.s_0402_stereotype_annotation.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

// 스테레오타입 애너테이션
@Service
public class OrderServiceImpl implements OrderService {

    // 필드
    private OrderRepository orderRepository;
    private OrderItemRepository orderItemRepository;
    private ProductRepository productRepository;

    // 생성자 주입
    public OrderServiceImpl(OrderRepository orderRepository, OrderItemRepository orderItemRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Order placeOrder(OrderInput orderInput, CartInput cartInput) {

        // repository 에 넘겨줄 order 객체 생성
        Order order = new Order();

        // ID 는 UUID 사용
        order.setId(UUID.randomUUID().toString());

        // 넘어온 주문정보(OrderInput)을 Order 객체에 저장
        // name, address, phone, email, paymentMethod
        order.setCustomerName(orderInput.getName());
        order.setCustomerAddress(orderInput.getEmailAddress());
        order.setCustomerPhone(orderInput.getPhone());
        order.setCustomerEmailAddress(orderInput.getEmailAddress());
        order.setOrderDateTime(LocalDateTime.now());
        order.setPaymentMethod(orderInput.getPaymentMethod());

        // 합계금액(세금미포함) 계산

        // 청구금액(세금포함) 계산

        return null;
    }
}
