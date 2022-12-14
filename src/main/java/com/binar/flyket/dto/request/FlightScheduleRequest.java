package com.binar.flyket.dto.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FlightScheduleRequest {

    @NonNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureTime;
    @NonNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrivalTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NonNull
    private LocalDate flightDate;
    @NonNull
    private String aircraftDetailId;
    @NonNull
    private String routeId;
}
