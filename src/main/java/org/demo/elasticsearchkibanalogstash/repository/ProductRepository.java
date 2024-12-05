package org.demo.elasticsearchkibanalogstash.repository;

import org.demo.elasticsearchkibanalogstash.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
