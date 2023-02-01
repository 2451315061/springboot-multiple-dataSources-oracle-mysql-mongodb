package com.xing.config;

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

@Configuration
@EnableMongoRepositories(mongoTemplateRef = "oneMongo")
public class OneMongoTemplateConf implements EnvironmentAware{

    private Environment environment;

    @Override
    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }
    
    @Bean(name = "oneMongo")
    @Primary
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDatabaseFactory());
    }
    
    @Bean(name = "oneMongoFactory")
    @Primary
    public MongoDatabaseFactory mongoDatabaseFactory() {
        MongoClient client = MongoClients.create(environment.getProperty("spring.data.mongodb.one.uri"));
        return new SimpleMongoClientDatabaseFactory(client, environment.getProperty("spring.data.mongodb.one.database"));
    }
}
