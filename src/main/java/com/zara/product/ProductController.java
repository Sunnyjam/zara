package com.zara.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/insertProduct")
    public int insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @PutMapping("/updateProduct")
    public int updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public int deleteProduct(@PathVariable int productId) {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/readProduct")
    public List<Product> readProduct() {
        return productService.readProduct();
    }

    @GetMapping("/searchProduct/{productName}")
    public Product searchProduct(@PathVariable String productName) {
        return productService.searchProduct(productName);
    }
}
