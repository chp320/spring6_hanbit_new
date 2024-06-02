package com.example.shopping.s_0402_stereotype_annotation;

import com.example.shopping.s_0002_common.entity.Order;
import com.example.shopping.s_0002_common.enumeration.PaymentMethod;
import com.example.shopping.s_0402_stereotype_annotation.input.CartInput;
import com.example.shopping.s_0402_stereotype_annotation.input.CartItemInput;
import com.example.shopping.s_0402_stereotype_annotation.input.OrderInput;
import com.example.shopping.s_0402_stereotype_annotation.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration      // DI컨테이너에 로딩하기 위한 설정정보 작성 - JavaConfig 방법
@ComponentScan      // 베이스 패키지 지정
public class ShoppingApplication {
    public static void main(String[] args) {
        System.out.println("===== ShoppingApplication (start) =====");

        // DI 컨테이너 생성
        @SuppressWarnings("resource")       // 컴파일 시 발생하는 경고 미표시 (참고 - https://ktko.tistory.com/entry/Java의-SuppressWarnings-사용하기)
        ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingApplication.class);
        OrderService orderService = context.getBean(OrderService.class);        // DI 컨테이너에서 가져오기 원하는 Bean 타입(Class 객체) 지정

        // 테스트 데이터 생성
        OrderInput orderInput = new OrderInput();
        orderInput.setName("김철수");
        orderInput.setAddress("서울시");
        orderInput.setPhone("010-0000-0000");
        orderInput.setEmailAddress("taro@example.com");
        orderInput.setPaymentMethod(PaymentMethod.CONVENIENCE_STORE);

        List<CartItemInput> cartItemInputs = new ArrayList<>();

        // 구매 품목
        CartItemInput keshigom = new CartItemInput();
        keshigom.setProductId("p01");
        keshigom.setProductName("지우개");
        keshigom.setProductPrice(100);
        keshigom.setQuantity(3);
        cartItemInputs.add(keshigom);

        CartItemInput note = new CartItemInput();
        note.setProductId("p02");
        note.setProductName("노트");
        note.setProductPrice(200);
        note.setQuantity(4);
        cartItemInputs.add(note);

        CartInput cartInput = new CartInput();
        cartInput.setCartItemInputs(cartItemInputs);

        // 주문 처리
        Order order = orderService.placeOrder(orderInput, cartInput);

        System.out.println("주문 확정 처리를 완료했습니다. 주문 id=" + order.getId());

        System.out.println("===== ShoppingApplication (end) =====");
    }
}
