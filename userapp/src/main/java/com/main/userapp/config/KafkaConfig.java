package com.main.userapp.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID)
    public  void updateLocation(ConsumerRecord<String,String> record)
    {
            String key = record.key();
            String location = record.value();
        System.out.println("Key : "+key +" , "+"Location : "+location );
    }
}
