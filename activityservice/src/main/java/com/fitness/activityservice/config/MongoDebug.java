package com.fitness.activityservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MongoDebug {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void showDb() {
        System.out.println("CONNECTED DATABASE: " + mongoTemplate.getDb().getName());
    }
}