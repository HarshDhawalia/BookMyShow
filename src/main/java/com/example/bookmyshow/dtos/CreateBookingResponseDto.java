package com.example.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;
import com.example.bookmyshow.dtos.ResponseStatus;


@Setter
@Getter
public class CreateBookingResponseDto {
    ResponseStatus responseStatus;
    Long bookingId;
}