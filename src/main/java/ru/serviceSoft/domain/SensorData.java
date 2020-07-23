package ru.serviceSoft.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class SensorData {

    private Integer timeStamp;
    private double value;
    private int sensorType;

    public SensorData(Integer timeStamp, double value, int sensorType) {
        this.timeStamp = timeStamp;
        this.value = value;
        this.sensorType = sensorType;
    }

}
