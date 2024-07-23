package com.example.kafka_demo.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("send")
public class SendMsgController {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;


    @RequestMapping
    @Transactional
    public Boolean send(@RequestParam String message){
        kafkaTemplate.send("my-topic", message);
        return true;
    }


}
