package com.example.digitalLibrary.service;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.service.resource.BookResponse;

import java.util.List;

public interface BookService {

    public void addBook(Book book);

    public Book getBook(Integer id);

    public List<Book> getAllBooks();

    public Book updateBook(Integer id,Book book);

    public void deleteBook(Integer id);


}
