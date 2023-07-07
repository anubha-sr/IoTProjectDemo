package com.project.iotproject.controller;

import com.project.iotproject.kafka.KafkaIoTProducer;
import com.project.iotproject.model.Simulator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/iot")
public class JsonMessageController {

    private KafkaIoTProducer kafkaIoTProducer;

    public JsonMessageController(KafkaIoTProducer kafkaIoTProducer)
    {
        this.kafkaIoTProducer = kafkaIoTProducer;
    }
@PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Simulator data)
    {
        kafkaIoTProducer.sendMessage(data);
        return ResponseEntity.ok("Json message sent to Kafka Topic");

    }
}
