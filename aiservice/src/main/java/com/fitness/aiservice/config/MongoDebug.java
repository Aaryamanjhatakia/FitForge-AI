package com.fitness.aiservice.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDebug {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void showDb() {
        System.out.println("CONNECTED DATABASE: " + mongoTemplate.getDb().getName());
    }
}