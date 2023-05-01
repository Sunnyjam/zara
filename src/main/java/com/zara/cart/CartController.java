package com.zara.cart;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CartController {
    private final CartService cartService;

    @PostMapping("/insertCart")
    public int insertCart(@RequestBody Cart cart) {
        return cartService.insertCart(cart);
    }

    @DeleteMapping("/deleteCart/{cartId}")
    public int deleteCart(@PathVariable int cartId) {
        return cartService.deleteCart(cartId);
    }

    @PutMapping("/updateCart")
    public int updateCart(@RequestBody Cart cart) {
        return cartService.updateCart(cart);
    }
}
