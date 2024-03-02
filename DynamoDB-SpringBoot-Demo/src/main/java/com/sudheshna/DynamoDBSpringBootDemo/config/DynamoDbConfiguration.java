package com.sudheshna.DynamoDBSpringBootDemo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbConfiguration {
    public DynamoDbMapper dynamoDbMapper(){
        return new DynamoDbMapper(buildAmazonDynamoDB());
    }
}
