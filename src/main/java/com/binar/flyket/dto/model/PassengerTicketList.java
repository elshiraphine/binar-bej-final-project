package com.binar.flyket.dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PassengerTicketList {
    private String ticketId;
    private String passengerTitle;
    private String passengerName;
    private String seatNo;
}
