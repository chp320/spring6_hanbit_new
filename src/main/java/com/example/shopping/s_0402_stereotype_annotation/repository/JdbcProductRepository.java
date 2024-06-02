package com.example.shopping.s_0402_stereotype_annotation.repository;

import com.example.shopping.s_0002_common.entity.Product;

public class JdbcProductRepository implements ProductRepository {
    @Override
    public Product selectById(String id) {
        if ("p01".equals(id)) {
            Product product = new Product();
            product.setId(id);
            product.setStock(10);
            return product;
        }
        if ("p02".equals(id)) {
            Product product = new Product();
            product.setId(id);
            product.setStock(20);
            return product;
        }
        throw new IllegalArgumentException("인수가 바르지 않습니다.");
    }

    @Override
    public Boolean update(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("인수가 바르지 않습니다.");
        }
        System.out.println("상품을 업데이트 했습니다. id=" + product.getId());
        return true;
    }
}
