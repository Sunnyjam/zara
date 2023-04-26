package com.zara.product;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    int insertProduct(Product product);
    int updateProduct(Product product);

    int deleteProduct(int productId);

    List<Product> readProduct();

    Product searchProduct(String productName);
}
