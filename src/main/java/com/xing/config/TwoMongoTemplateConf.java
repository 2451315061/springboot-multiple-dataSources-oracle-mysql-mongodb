package com.xing.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(mongoTemplateRef = "twoMongo")
public class TwoMongoTemplateConf implements EnvironmentAware{

    private Environment environment;

    @Override
    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }
    
    @Bean(name = "twoMongo")
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDatabaseFactory());
    }
    
    @Bean(name = "twoMongoFactory")
    public MongoDatabaseFactory mongoDatabaseFactory() {
        MongoClient client = MongoClients.create(environment.getProperty("spring.data.mongodb.two.uri"));
        return new SimpleMongoClientDatabaseFactory(client, environment.getProperty("spring.data.mongodb.two.database"));
    }
}
