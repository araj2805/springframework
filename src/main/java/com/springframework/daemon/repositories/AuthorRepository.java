package com.springframework.daemon.repositories;

import com.springframework.daemon.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
