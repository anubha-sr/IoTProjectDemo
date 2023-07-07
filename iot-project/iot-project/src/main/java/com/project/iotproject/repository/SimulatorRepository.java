package com.project.iotproject.repository;


import com.project.iotproject.model.Simulator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulatorRepository extends MongoRepository<Simulator,String>
{
}
