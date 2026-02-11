package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
<<<<<<< HEAD
public class Seat  extends BaseModel {
=======
public class Seat extends BaseModel {
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    private String seatNumber;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private Integer rn;
    private Integer cn;
<<<<<<< HEAD
}
=======
}
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
