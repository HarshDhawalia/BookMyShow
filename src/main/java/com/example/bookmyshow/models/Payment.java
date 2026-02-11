package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Payment extends BaseModel {
    private Double amount;
<<<<<<< HEAD
    @Enumerated(EnumType.ORDINAL)
=======
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    private PaymentMode paymentMode;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private String referenceNumber;
<<<<<<< HEAD
}
=======
}
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
