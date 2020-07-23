package ru.serviceSoft.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ResultData {

    private Integer timeStamp;
    private LocationData location;
    private List<SensorData> sensors = new ArrayList<>();

    public ResultData(List<SensorData> sensors) {
        this.sensors = sensors;
    }

    public ResultData(Integer timeStamp, LocationData location) {
        this.timeStamp = timeStamp;
        this.location = location;
    }

    public ResultData(Integer timeStamp, LocationData location, SensorData sensor) {
        this.timeStamp = timeStamp;
        this.location = location;
        this.sensors.add(sensor);
    }

    public ResultData(Integer timeStamp, LocationData location, List<SensorData> sensors) {
        this.timeStamp = timeStamp;
        this.location = location;
        this.sensors = sensors;
    }

    public void setSensors(SensorData sensor) {
        this.sensors.add(sensor);
    }

    public List<SensorData> getSensors() {
        return sensors;
    }

}
