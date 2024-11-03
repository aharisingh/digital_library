package com.example.digitalLibrary.service.resource;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.domain.Review;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequest {

    @NotBlank(message = "comment can't be blank")
    private String comment;
    @Min(value = 1 , message = "rating can't be less than 1")
    @Max(value = 5, message = "rating can't be greater than 5")
    private Double rating;
    @Min(value = 0 , message = "Book Id can't be blank")
    private Integer bookId;

    public Review getReview(){
        return Review.builder().comment(this.comment).rating(this.rating).book(Book.builder().id(this.bookId).build()).build();
    }

}
