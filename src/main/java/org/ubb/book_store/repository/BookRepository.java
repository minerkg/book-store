package org.ubb.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubb.book_store.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
