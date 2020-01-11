package com.springframework.daemon.bootstrap;

import com.springframework.daemon.model.Author;
import com.springframework.daemon.model.Book;
import com.springframework.daemon.repositories.AuthorRepository;
import com.springframework.daemon.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    private void initdata()
    {
        Author author1 = new Author();
        author1.setFirstname("Ankit");
        author1.setLastname("Raj");

        Book book = new Book();
        book.setIsbn("1234");
        book.setPublisher("Penguin");
        book.setTitle("Way o life");

        author1.getBooks().add(book);
        book.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book);


        Author author2 = new Author();
        author2.setFirstname("Aman");
        author2.setLastname("Raj");

        Book book1 = new Book();
        book1.setIsbn("5678");
        book1.setPublisher("NCRET");
        book1.setTitle("Science and World");

        author2.getBooks().add(book1);
        book1.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book1);
    }



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initdata();
    }
}
