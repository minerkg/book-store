package org.ubb.book_store.service;

import org.ubb.book_store.domain.Book;

public interface IBookService {

    Book getBookById(Long id);
}
