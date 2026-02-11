package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Booking extends BaseModel {
    @ManyToOne
    private User user;;

    @ManyToOne
    private Show_ show;
    private int amount;
    @OneToMany
    private List<Payment> payments;
    private Date bookingDate;
    @OneToMany
    private List<ShowSeat> showSeat;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
}
