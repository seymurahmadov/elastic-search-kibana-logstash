package org.demo.elasticsearchkibanalogstash.service;

import org.demo.elasticsearchkibanalogstash.elastic.ProductDocument;
import org.demo.elasticsearchkibanalogstash.entity.Product;
import org.demo.elasticsearchkibanalogstash.repository.ProductElasticsearchRepository;
import org.demo.elasticsearchkibanalogstash.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductElasticsearchRepository elasticsearchRepository;

    public ProductService(ProductRepository productRepository, ProductElasticsearchRepository elasticsearchRepository) {
        this.productRepository = productRepository;
        this.elasticsearchRepository = elasticsearchRepository;
    }

    public Product saveProduct(Product product) {
        Product savedProduct = productRepository.save(product);

        ProductDocument productDocument = new ProductDocument();
        productDocument.setId(savedProduct.getId().toString());
        productDocument.setName(savedProduct.getName());
        productDocument.setDescription(savedProduct.getDescription());
        productDocument.setPrice(savedProduct.getPrice());

        elasticsearchRepository.save(productDocument);
        return savedProduct;
    }

//    public List<ProductDocument> searchProducts(String query) {
//        return elasticsearchRepository.findByNameContainingIgnoreCase(query);
//    }
}
