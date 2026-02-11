package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD

import java.util.Date;
import java.util.List;
=======
import java.util.List;
import java.util.Date;
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040

@Setter
@Getter
@Entity
public class Show_ extends BaseModel {
    @ManyToOne
    private Movie movie;
<<<<<<< HEAD

=======
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    @ManyToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;
<<<<<<< HEAD
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
=======
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    private List<Feature> features;
}
