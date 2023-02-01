package com.xing.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MongoConfiguration {
	
	@Bean(name = "oneMongoProperties")
    @Primary
    @ConfigurationProperties(prefix = "spring.data.mongodb.one")
    public MongoProperties masterMongoProperties() {
        return new MongoProperties();
    }
    @Bean(name = "twoMongoProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.two")
    public MongoProperties twoMongoProperties() {
        return new MongoProperties();
    }
}
