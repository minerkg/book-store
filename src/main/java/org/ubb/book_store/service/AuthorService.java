package org.ubb.book_store.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ubb.book_store.domain.Author;
import org.ubb.book_store.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService implements IAuthorService{


    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public List<Author> getAllAuthors() {
        return null;
    }
}
