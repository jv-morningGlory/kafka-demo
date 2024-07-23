package com.example.kafka_demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = {"my-topic"})
    public void onMessage(ConsumerRecord<String,String> record){
        System.out.println("简单消费Topic："+record.topic()+"**分区"+record.partition()+"**值内容"+record.value());
    }



}
