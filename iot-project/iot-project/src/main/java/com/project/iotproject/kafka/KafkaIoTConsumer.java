package com.project.iotproject.kafka;

import com.project.iotproject.model.Simulator;
import com.project.iotproject.repository.SimulatorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class KafkaIoTConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaIoTConsumer.class);
    @Autowired
    private SimulatorRepository simulatorRepository;



@KafkaListener(topics = "IoTTopic", groupId = "DeviceService")
    public String consume(@RequestBody Simulator simulator){
    simulatorRepository.save(simulator);

    LOGGER.info(String.format("Json message received ->%s", simulator.toString()));

        return "data saved successfully";
   }
}
