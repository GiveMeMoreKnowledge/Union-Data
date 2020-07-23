package ru.serviceSoft.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class LocationData {

    private Integer timeStamp;

    // coordinates
    private double latitude;
    private double longitude;

    public LocationData(Integer timeStamp, double latitude, double longitude) {
        this.timeStamp = timeStamp;
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
