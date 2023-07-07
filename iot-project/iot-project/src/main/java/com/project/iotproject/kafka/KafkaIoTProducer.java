package com.project.iotproject.kafka;

import com.project.iotproject.model.Simulator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class KafkaIoTProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaIoTProducer.class);

    @Autowired
    private KafkaTemplate<String, Simulator> kafkaTemplate;

    public KafkaIoTProducer(KafkaTemplate<String, Simulator> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }
    //@Scheduled(fixedRate=5000)
    public void sendMessage(Simulator data){
        System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());

        LOGGER.info(String.format("Message sent ->%s", data.toString()));

        Message<Simulator> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "IoTTopic")
                .build();

        kafkaTemplate.send(message);
    }



}
