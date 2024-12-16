package org.demo.elasticsearchkibanalogstash.repository;

import org.demo.elasticsearchkibanalogstash.elastic.ProductDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductElasticsearchRepository extends ElasticsearchRepository<ProductDocument, String> {

    List<ProductDocument> findAllByName(String query);

}
