package com.example.digitalLibrary.controller;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.domain.Review;
import com.example.digitalLibrary.service.BookService;
import com.example.digitalLibrary.service.ReviewService;
import com.example.digitalLibrary.service.resource.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    BookService bookService;

    @Autowired
    ReviewService reviewService;

    public UserController(BookService bookService, ReviewService reviewService){
        this.bookService=bookService;
        this.reviewService= reviewService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
      return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

}
