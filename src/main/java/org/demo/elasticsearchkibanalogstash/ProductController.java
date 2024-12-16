package org.demo.elasticsearchkibanalogstash;

import org.demo.elasticsearchkibanalogstash.elastic.ProductDocument;
import org.demo.elasticsearchkibanalogstash.entity.Product;
import org.demo.elasticsearchkibanalogstash.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public List<ProductDocument> searchProducts(@RequestParam String query) {
        return productService.searchProducts(query);
    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        return ResponseEntity.ok(savedProduct);
    }


}