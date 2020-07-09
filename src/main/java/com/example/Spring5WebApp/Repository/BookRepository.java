package com.example.Spring5WebApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Spring5WebApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
