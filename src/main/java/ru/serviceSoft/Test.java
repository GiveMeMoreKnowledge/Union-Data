package ru.serviceSoft;

import ru.serviceSoft.domain.LocationData;
import ru.serviceSoft.domain.ResultData;
import ru.serviceSoft.domain.SensorData;
import ru.serviceSoft.service.UnionData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Integer> timeStamp = new ArrayList<>();
        List<LocationData> locationDataList = new ArrayList<>();
        List<SensorData> sensorDataList = new ArrayList<>();

        UnionData.generateTimeStamp(timeStamp, locationDataList);
        UnionData.generateSensorData(timeStamp, sensorDataList);

        List<ResultData> resultData = UnionData.union(sensorDataList, locationDataList);

        for (var x : resultData) {
            System.out.println(x);
        }
    }

}
