package com.example.digitalLibrary;

import com.example.digitalLibrary.domain.Book;
import com.example.digitalLibrary.domain.Genre;
import com.example.digitalLibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DigitalLibraryApplication {


	public static void main(String[] args) {

		SpringApplication.run(DigitalLibraryApplication.class, args);

	}

}
