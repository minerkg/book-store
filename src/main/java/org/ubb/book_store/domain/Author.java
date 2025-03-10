package org.ubb.book_store.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author extends BaseEntity<Long> {

    @Column(unique = true)
    private String ssn;

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    String street;
    String city;


}
