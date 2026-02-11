package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
<<<<<<< HEAD
public class Theatre extends BaseModel {
=======
public class Theatre extends BaseModel{
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    @ManyToOne
    private City city;
    private String name;
    @OneToMany
    private List<Screen> screens;
}
