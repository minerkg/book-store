package org.ubb.book_store.service;

import org.ubb.book_store.domain.Author;
import org.ubb.book_store.dto.AuthorDto;

import java.util.List;


public interface IAuthorService {


    List<Author> getAllAuthors();

    void addAuthor(Author newAuthor);
}
