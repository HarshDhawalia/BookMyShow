package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD
import com.example.bookmyshow.models.User;

=======
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Booking extends BaseModel {
<<<<<<< HEAD
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @ManyToOne
    private User user;
    @ManyToOne
    private Show_ show_;
=======
    @ManyToOne
    private User user;;

    @ManyToOne
    private Show_ show;
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    private int amount;
    @OneToMany
    private List<Payment> payments;
    private Date bookingDate;
    @OneToMany
    private List<ShowSeat> showSeat;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
<<<<<<< HEAD

}
=======
}
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
