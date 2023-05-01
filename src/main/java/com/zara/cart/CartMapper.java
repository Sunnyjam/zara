package com.zara.cart;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {
    int insertCart(Cart cart);

    int deleteCart(int cartId);

    int updateCart(Cart cart);

}
