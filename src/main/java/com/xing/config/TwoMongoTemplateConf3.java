package com.xing.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
//@EnableMongoRepositories(mongoTemplateRef = "twoMongo")
public class TwoMongoTemplateConf3 {
//    private final MongoProperties mongoProperties;
//    public TwoMongoTemplateConf(@Qualifier("twoMongoProperties") MongoProperties mongoProperties) {
//        this.mongoProperties = mongoProperties;
//    }
//    @Bean(name = "twoMongo")
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoDatabaseFactory(mongoProperties));
//    }
//    @Bean(name = "twoMongoFactory")
//    public MongoDatabaseFactory mongoDatabaseFactory(MongoProperties mongoProperties) {
//        return new SimpleMongoClientDatabaseFactory(mongoProperties.getUri());
////        return new SimpleMongoClientDatabaseFactory(mongoProperties.getUri());
//    }
}
