package com.main.deliveryApp.service;

import com.main.deliveryApp.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public boolean updateLocation(String location) {

        String key="2";
        kafkaTemplate.send(AppConstants.LOCATION_UPDATE_TOPIC,key,   location);
        System.out.println("message produce : ");

        return true;
    }
}
