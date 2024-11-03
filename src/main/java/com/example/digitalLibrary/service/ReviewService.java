package com.example.digitalLibrary.service;

import com.example.digitalLibrary.domain.Review;

public interface ReviewService {
    public void addReview(Review review);

    public Review updateReview(Integer id ,Review review);

    public void deleteReview(Integer id);
}
