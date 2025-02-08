package org.ubb.book_store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ubb.book_store.domain.Author;
import org.ubb.book_store.service.IAuthorService;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AuthorController {

    private final IAuthorService authorService;

    @Autowired
    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    ResponseEntity<ApiResponse<Author>> getAllAuthor() {
        List<Author> authorList =
        return ResponseEntity.ok(new ApiResponse<>("All authors", authorList));
    }
}
