package com.project.iotproject.repository;

import com.project.iotproject.model.DeviceDetail;
import com.project.iotproject.model.Simulator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends MongoRepository<DeviceDetail,String> {
}
