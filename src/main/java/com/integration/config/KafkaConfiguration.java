package com.integration.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("mvd_employee").build();
    }

    @Bean
    public NewTopic changeEmployment(){
        return TopicBuilder.name("change_employment").build();
    }
}
