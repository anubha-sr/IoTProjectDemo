package com.project.iotproject.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
@Document(collection = "deviceData")
public class Simulator {
    private String deviceID;
    private int Voltage;
    private int temperature;
    private int rpm;
    private String compressorState;
    private int timeStamp;

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public int getVoltage() {
        return Voltage;
    }

    public void setVoltage(int voltage) {
        voltage = voltage;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String getCompressorState() {
        return compressorState;
    }

    public void setCompressorState(String compressorState) {
        this.compressorState = compressorState;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Simulator{" +
                "deviceID='" + deviceID + '\'' +
                ", Voltage=" + Voltage +
                ", temperature=" + temperature +
                ", rpm=" + rpm +
                ", compressorState='" + compressorState + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
