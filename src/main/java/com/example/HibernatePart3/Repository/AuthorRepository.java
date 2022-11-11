package com.example.HibernatePart3.Repository;

import com.example.HibernatePart3.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
