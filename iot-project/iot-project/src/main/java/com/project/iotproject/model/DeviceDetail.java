package com.project.iotproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "deviceDetail")
public class DeviceDetail {
    @Id
    private String deviceID;

    private String name;

    private String description;

    public String getDeviceID() {
        return deviceID;
    }

    public DeviceDetail(){

    }
    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
