package com.springframework.daemon.repositories;

import com.springframework.daemon.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
