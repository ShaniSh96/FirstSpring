package com.example.Spring5WebApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Spring5WebApp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
