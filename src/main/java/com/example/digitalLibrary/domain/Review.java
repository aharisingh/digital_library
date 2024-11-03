package com.example.digitalLibrary.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Review {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    private String author;
    private Double rating;
    //Review -  Book
    //Many review can be of one book
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
