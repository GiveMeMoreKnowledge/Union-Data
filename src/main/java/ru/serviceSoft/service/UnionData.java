package ru.serviceSoft.service;

import ru.serviceSoft.domain.LocationData;
import ru.serviceSoft.domain.ResultData;
import ru.serviceSoft.domain.SensorData;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionData {

    public static int j;
    private static double rand;

    public static void generateTimeStamp(List<Integer> timeStamp,
                                         List<LocationData> locationDataList) {

        for (int i = 0; i < 100; ++i) {
            rand = Math.random() * 1000;
            timeStamp.add(i);
            locationDataList.add(new LocationData(timeStamp.get(i), rand, rand));
        }
    }

    public static void generateSensorData(List<Integer> timeStamp,
                                          List<SensorData> sensorDataList) {
        int j = 0;
        for (int i = 0; i < 300; ++i) {
            rand = Math.random() * 1000;
            sensorDataList.add(
                    new SensorData(timeStamp.get(j),
                            rand, (int) (Math.random() * 10)));
            ++j;
            if (j >= 100) {
                j = 0;
            }
        }
    }

    public static List<ResultData> union(List<SensorData> sensorDataList, List<LocationData> locationDataList) {
        Map<Integer, ResultData> middle = new HashMap<>();

        for (LocationData location : locationDataList) {
            ResultData resultData = new ResultData();
            resultData.setLocation(location);
            Integer time = location.getTimeStamp();
            resultData.setTimeStamp(time);
            middle.put(time, resultData);
        }

        for (SensorData sensor : sensorDataList) {
            ResultData resultData = middle.get(sensor.getTimeStamp());
            resultData.setSensors(sensor);
        }

        return new ArrayList<>(middle.values());
    }

    public static void display(List<?> data) {
        for (var x : data) {
            System.out.println(x);
        }
    }

}
