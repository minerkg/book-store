package org.ubb.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ubb.book_store.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
