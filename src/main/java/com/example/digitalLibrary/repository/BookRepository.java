package com.example.digitalLibrary.repository;

import com.example.digitalLibrary.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

}

/*
*JPA is an Interface , Hibernate is an Implementation
*
*
*
* */
