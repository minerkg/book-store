package org.ubb.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubb.book_store.domain.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    List<Book> findByYear(Integer year);

    List<Book> findByRating(Integer rating);

}
