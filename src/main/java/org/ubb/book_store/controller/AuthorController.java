package org.ubb.book_store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.ubb.book_store.domain.Author;
import org.ubb.book_store.domain.ResourceAlreadyExists;
import org.ubb.book_store.dto.AuthorDto;
import org.ubb.book_store.service.IAuthorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;


    @GetMapping("/authors")
    ResponseEntity<ApiResponse<List<Author>>> getAllAuthor() {
        try {
            List<Author> authorList = authorService.getAllAuthors();
            return ResponseEntity.ok(new ApiResponse<>("All authors", authorList));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/authors")
    ResponseEntity<ApiResponse<Author>> addAuthor(@RequestBody Author newAuthor) {
        try {
            authorService.addAuthor(newAuthor);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (ResourceAlreadyExists e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ApiResponse<>("Author already exists", null));

        }
    }
}
