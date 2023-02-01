package com.xing.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

//@Configuration
//@EnableMongoRepositories(mongoTemplateRef = "oneMongo")
public class OneMongoTemplateConf3 {
    
//	private final MongoProperties mongoProperties;
//    public OneMongoTemplateConf(@Qualifier("oneMongoProperties") MongoProperties mongoProperties) {
//        this.mongoProperties = mongoProperties;
//    }
//    @Bean(name = "oneMongo")
//    @Primary
//    public MongoTemplate mongoTemplate() {
//        MongoTemplate cc = new MongoTemplate(mongoDatabaseFactory(mongoProperties));
//        
//        return cc;
//    }
//    
//    @Bean(name = "oneMongoFactory")
//    @Primary
//    public MongoDatabaseFactory mongoDatabaseFactory(MongoProperties mongoProperties) {
//        MongoClient client = MongoClients.create(mongoProperties.getUri());
//        return new SimpleMongoClientDatabaseFactory(client, "ccbscf-mps-certificate-d3");
//    }
}
