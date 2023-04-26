package com.zara.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Product> readProduct() {
        return productMapper.readProduct();
    }

    public Product searchProduct(String productName) {
        return productMapper.searchProduct(productName);
    }
}
