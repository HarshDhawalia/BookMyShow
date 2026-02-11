package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Date;

@Setter
@Getter
@Entity
public class Show_ extends BaseModel {
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;
}
