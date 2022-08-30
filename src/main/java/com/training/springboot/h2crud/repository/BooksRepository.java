package com.training.springboot.h2crud.repository;

import com.training.springboot.h2crud.model.Books;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer> {
}
