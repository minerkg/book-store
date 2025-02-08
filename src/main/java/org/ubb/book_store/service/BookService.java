package org.ubb.book_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ubb.book_store.domain.Book;
import org.ubb.book_store.repository.BookRepository;

import java.util.List;

@Service
public class BookService implements IBookService {


    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Book doesn't find!")
        );
    }

    @Override
    public List<Book> getAllBooksFiltered() {

        return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllBooksFilteredByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> getAllBooksFilteredByYear(Integer year) {
        return bookRepository.findByYear(year);
    }

    @Override
    public List<Book> getAllBooksFilteredByRating(Integer rating) {
        return bookRepository.findByRating(rating);
    }
}
