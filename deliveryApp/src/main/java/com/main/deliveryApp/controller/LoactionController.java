package com.main.deliveryApp.controller;

import com.main.deliveryApp.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoactionController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/location/update")
    public ResponseEntity<?> updateLocation() {
        kafkaService.updateLocation("("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+")");
        return new ResponseEntity<>(Map.of("Message", "update location"), HttpStatus.OK);
    }
}
