package com.zara.product;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    int insertProduct(Product product);
    int updateProduct(Product product);

    int deleteProduct(int productId);
}
