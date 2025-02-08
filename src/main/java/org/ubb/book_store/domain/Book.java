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
public class Book extends BaseEntity<Long>{


    String title;
    int year;
    int rating;


}
