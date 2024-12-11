package org.zerock.kafkaconsumer.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-MSKTutorialTopic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}