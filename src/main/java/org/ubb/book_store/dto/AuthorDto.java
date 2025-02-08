package org.ubb.book_store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ubb.book_store.domain.Gender;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {

    private String ssn;
    private String name;
    private Gender gender;
    private String street;
    private String city;


}
