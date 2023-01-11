package com.example.kaushop.controller;

import com.example.kaushop.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/v1/product/{productId}")
    public ResponseEntity<Product> getProduct(
            @PathVariable("productId") long productId
    ) {
        Product product = new Product();
        product.setId(productId);
        product.setName("상품"+productId);

        return ResponseEntity.ok(product);
    }


}
