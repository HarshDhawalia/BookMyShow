package com.example.bookmyshow.models;
<<<<<<< HEAD

=======
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD
=======
import org.springframework.boot.autoconfigure.web.WebProperties;
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040

import java.util.Date;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD

    private Date createdAt;

=======
    private Date createdAt;
>>>>>>> 772c09ab832c4860fb9ab7f29e86e2ddc4b72040
    private Date lastUpdatedAt;
}
