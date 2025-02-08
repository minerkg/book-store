package org.ubb.book_store.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ubb.book_store.domain.Author;
import org.ubb.book_store.domain.ResourceAlreadyExists;
import org.ubb.book_store.dto.AuthorDto;
import org.ubb.book_store.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService implements IAuthorService{

    @Autowired
     private AuthorRepository authorRepository;


    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void addAuthor(Author newAuthor) {
        String existingSsn = newAuthor.getSsn();

        authorRepository.findBySsn(existingSsn)
                .ifPresent( s -> { throw new ResourceAlreadyExists();}
                );

        authorRepository.save(newAuthor);

    }
}
