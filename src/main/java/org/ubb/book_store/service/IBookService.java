package org.ubb.book_store.service;

import org.ubb.book_store.domain.Book;

import java.util.List;

public interface IBookService {

    Book getBookById(Long id);

    List<Book> getAllBooksFiltered();
}
