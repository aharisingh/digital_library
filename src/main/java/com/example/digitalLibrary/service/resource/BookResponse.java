package com.example.digitalLibrary.service.resource;

import com.example.digitalLibrary.domain.Genre;
import com.example.digitalLibrary.domain.Review;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse {

    private String title;
    private String author;
    private Genre genre;
    private Double rating;
    private Double cost;
    private Integer year;

    private List<Review> reviewList;
}
