package com.example.digitalLibrary.service.resource;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.domain.Genre;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {

    @NotBlank(message = "title can't be blank")
    private String title;
    @NotBlank(message = "author can't be blank")
    private String author;
    private Genre genre;
    @Min(value = 0 , message = "cost can't be less than zero")
    private Double cost;
    @Min(value=1000,message = "year can't be less than 1000")
    private Integer year;

    public Book getBook(){
        return Book.builder().title(this.title).
                author(this.author).genre(this.genre).
                cost(this.cost).year(this.year)
                .rating(0.0).build();
    }
}
