package com.project.iotproject.controller;

import com.project.iotproject.model.DeviceDetail;
import com.project.iotproject.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/iot")
public class DeviceController {
    @Autowired
    private DeviceRepository repo;
@PostMapping("/addDevice")
@ResponseStatus(HttpStatus.CREATED)
    public String saveDevice(@RequestBody DeviceDetail deviceDetail){
        repo.save(deviceDetail);
        return "Added successfully";
    }
@GetMapping("/findAllDevices")
    public List<DeviceDetail> getDevices(){
        return repo.findAll();
    }

    @GetMapping("/find/{deviceID}")
    public DeviceDetail getDevice(@PathVariable String deviceID){
       return repo.findById(deviceID).get();
    }
    @PutMapping("/update/{deviceID}")
    public DeviceDetail updateDevice(@RequestBody DeviceDetail deviceDetail,
                                     @PathVariable String deviceID )
    {
        //get existing doc from DB
        //populate new request from request to existing entity
        DeviceDetail existingDevice = repo.findById(deviceID).get();
        existingDevice.setDescription(deviceDetail.getDescription());
        existingDevice.setName(deviceDetail.getName());
        return repo.save(existingDevice);

    }

    @DeleteMapping("/delete/{deviceID}")
    public String deleteDevice(@PathVariable String deviceID)
    {
        repo.deleteById(deviceID);
        return deviceID+"Deleted successfully";
    }
}
