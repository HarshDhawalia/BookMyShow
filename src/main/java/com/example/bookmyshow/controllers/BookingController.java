package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.CreateBookingRequestDto;
import com.example.bookmyshow.dtos.CreateBookingResponseDto;
import com.example.bookmyshow.dtos.ResponseStatus;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public CreateBookingResponseDto createBooking(CreateBookingRequestDto bookingRequestDto ) {
        CreateBookingResponseDto createBookingResponseDto = new CreateBookingResponseDto();
        try {
            Booking booking = bookingService.createBooking(bookingRequestDto.getUserId(),
                    bookingRequestDto.getShowId(),
                    bookingRequestDto.getShowSeatIds());

            createBookingResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            createBookingResponseDto.setBookingId(booking.getId());
            return createBookingResponseDto;
        } catch (Exception exception) {
            createBookingResponseDto.setResponseStatus(ResponseStatus.FAILURE);
            createBookingResponseDto.setBookingId(null);
            return createBookingResponseDto;
        }
    }
}
