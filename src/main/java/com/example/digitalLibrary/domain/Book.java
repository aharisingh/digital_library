package com.example.digitalLibrary.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String author;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;
    private Double rating;
    private Double cost;
    private Integer year;

    //Book -  Review
    //one book can have many review
    @OneToMany(mappedBy = "book")
    @JsonIgnoreProperties("book")
    private List<Review> reviewList;

}
