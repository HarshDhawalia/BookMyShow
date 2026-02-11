package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
=======
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
<<<<<<< HEAD
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show_ show_;
    @Enumerated(EnumType.ORDINAL)
=======
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show_ show;
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    private SeatType seatType;
    private Double price;
}
