package org.demo.elasticsearchkibanalogstash.elastic;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products")
@Getter
@Setter
public class ProductDocument {

    @Id
    private String id;

    private String name;

    private String description;

    private Double price;

}
