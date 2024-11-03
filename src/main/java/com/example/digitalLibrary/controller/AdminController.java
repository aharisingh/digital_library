package com.example.digitalLibrary.controller;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.service.BookService;
import com.example.digitalLibrary.service.resource.BookRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    BookService bookService;

    public AdminController(BookService bookService){
        bookService =  this.bookService;
    }

    //create Book
    @PostMapping("/book")
    public ResponseEntity<Book> createBook(@RequestBody @Valid BookRequest bookRequest){
       bookService.addBook(bookRequest.getBook());
       return new ResponseEntity<>(HttpStatus.CREATED);
    }
    //update Book
    @PutMapping("/book")
    public ResponseEntity<Book> updateBook(@RequestParam("bookId") Integer id, @RequestBody Book book){
        bookService.updateBook(id,book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //delete Book
    @DeleteMapping("/book")
    public ResponseEntity<Book> deleteBook(@RequestParam("bookId") Integer id){
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
