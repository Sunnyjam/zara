package com.zara.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;

    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    public int deleteProduct(int productId) {
        return productMapper.deleteProduct(productId);
    }
}
