package com.springframework.daemon.repositories;

import com.springframework.daemon.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
