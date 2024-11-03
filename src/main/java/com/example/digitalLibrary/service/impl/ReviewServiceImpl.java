package com.example.digitalLibrary.service.impl;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.domain.Review;
import com.example.digitalLibrary.repository.BookRepository;
import com.example.digitalLibrary.repository.ReviewRepository;
import com.example.digitalLibrary.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    BookRepository bookRepository;
    @Override
    public void addReview(Review review) {
        Optional<Book> optionalBook = bookRepository.findById(review.getBook().getId());
        if(optionalBook.isEmpty()){
            throw new IllegalArgumentException("Book Id doesn't exist");
        }
        review.setBook(optionalBook.get());
        reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Integer id ,Review review) {
       if(reviewRepository.findById(id).isPresent()){
           review.setId(id);
           reviewRepository.save(review);
       }
       return review;
    }

    @Override
    public void deleteReview(Integer id) {
        reviewRepository.deleteById(id);
    }
}
