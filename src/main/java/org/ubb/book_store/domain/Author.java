package org.ubb.book_store.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Author extends BaseEntity<Long> {

    @Id
    @UniqueConstraint('ssn')
    private String ssn;

    private String name;
    private Gender gender;
    String street;
    String city;


}
