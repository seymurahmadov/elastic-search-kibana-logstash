package org.demo.elasticsearchkibanalogstash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class ElasticSearchKibanaLogstashApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchKibanaLogstashApplication.class, args);
    }

}
