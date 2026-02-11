package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class City extends BaseModel {
    private String name;
    @OneToMany
<<<<<<< HEAD
    private List<Theatre> theatres;
}
=======
    private List<Theatre>  theatre;
}
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
