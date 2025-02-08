package org.ubb.book_store.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Book {

    @Id
    private Long id;
    private String title;


    public Book() {

    }
}
