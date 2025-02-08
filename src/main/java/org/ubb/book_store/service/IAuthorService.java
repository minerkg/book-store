package org.ubb.book_store.service;

import org.ubb.book_store.domain.Author;
import org.ubb.book_store.repository.AuthorRepository;

import java.util.List;

public interface IAuthorService {


    List<Author> getAllAuthors();
}
