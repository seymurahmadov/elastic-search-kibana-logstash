package org.demo.elasticsearchkibanalogstash.repository;

import org.demo.elasticsearchkibanalogstash.elastic.ProductDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductElasticsearchRepository extends ElasticsearchRepository<ProductDocument, String> {

    List<ProductDocument> findByName(String query);

}
