package com.binar.flyket.dto.model;

import com.binar.flyket.model.AircraftClass;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FlightScheduleDetailDTO {
    private String flightScheduleId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrivalTime;
    private AircraftClass aircraftClass;
    private String aircraftType;
    private String originAirportCode;
    private String originAirportName;
    private String originAirportCity;
    private String destinationAirportCode;
    private String destinationAirportName;
    private String destinationAirportCity;
    private Integer hours;
    private Integer minutes;
    private BigDecimal price;
    private Integer maxBaggage;
    private Integer maxCabin;
}
