package com.project.iotproject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;
@EnableKafka
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic IoTTopic(){
        return TopicBuilder.name("IoTTopic").build();
    }


}
