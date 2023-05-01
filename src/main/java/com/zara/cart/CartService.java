package com.zara.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartMapper cartMapper;

    public int insertCart(Cart cart) {
        return cartMapper.insertCart(cart);
    }

    public int deleteCart(int cartId) {
        return cartMapper.deleteCart(cartId);
    }

    public int updateCart(Cart cart) {
        return cartMapper.updateCart(cart);
    }
}
