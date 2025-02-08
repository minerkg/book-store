package org.ubb.book_store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ubb.book_store.domain.Author;
import org.ubb.book_store.service.IAuthorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;


    @GetMapping("/books")
    ResponseEntity<ApiResponse<List<Author>>> getAllAuthor() {
        try {
            List<Author> authorList = authorService.getAllAuthors();
            return ResponseEntity.ok(new ApiResponse<>("All authors", authorList));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
