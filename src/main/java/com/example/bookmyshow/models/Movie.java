package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Movie extends BaseModel {
    private String name;
    private Double rating;
    private String genre;
<<<<<<< HEAD
}
=======
}
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
