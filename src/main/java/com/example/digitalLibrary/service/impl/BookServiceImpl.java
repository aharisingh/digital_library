package com.example.digitalLibrary.service.impl;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.repository.BookRepository;
import com.example.digitalLibrary.repository.ReviewRepository;
import com.example.digitalLibrary.service.BookService;
import com.example.digitalLibrary.service.resource.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ReviewRepository reviewRepository;
    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBook(Integer id) {
       return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>)bookRepository.findAll();
    }

    @Override
    public Book updateBook(Integer id, Book book) {
       if(bookRepository.findById(id).isPresent()){
           book.setId(id);
           bookRepository.save(book);
       }
       return book;
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
