package com.example.kaushop.service;

import com.example.kaushop.entity.Product;
import com.example.kaushop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    public Product getProduct(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("상품"+id);

        return product;
    }
}