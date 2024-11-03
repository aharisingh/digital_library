package com.example.digitalLibrary.repository;

import com.example.digitalLibrary.domain.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository  extends CrudRepository<Review,Integer> {

    List<Review> findByBookId(Integer bookId);
}
