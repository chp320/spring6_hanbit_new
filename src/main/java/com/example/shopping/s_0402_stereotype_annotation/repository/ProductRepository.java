package com.example.shopping.s_0402_stereotype_annotation.repository;

import com.example.shopping.s_0002_common.entity.Product;

public interface ProductRepository {
    Product selectById(String id);

    Boolean update(Product product);
}
