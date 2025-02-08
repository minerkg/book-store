package org.ubb.book_store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.ubb.book_store.domain.Book;
import org.ubb.book_store.dto.BookDto;
import org.ubb.book_store.service.IBookService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {


    private final IBookService bookService;


    @Autowired
    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }


    @PutMapping("/books/{id}")
    ResponseEntity<ApiResponse<Book>> updateBook(@PathVariable Long id, @RequestBody BookDto book) {
        try {
            this.bookService.update(id, book);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


    @GetMapping("/books")
    ResponseEntity<ApiResponse<List<Book>>> getAllBooksFiltered(@RequestParam(required = false) String title,
                                                                @RequestParam(required = false) String year,
                                                                @RequestParam(required = false) String rating) {

        List<Book> bookList = bookService.getAllBooksFiltered();
        if (title != null) {
            bookList = bookService.getAllBooksFilteredByTitle(title);
        }
        if (year != null) {
            bookList = bookService.getAllBooksFilteredByYear(Integer.valueOf(year));
        }
        if (rating != null) {
            bookList = bookService.getAllBooksFilteredByRating(Integer.valueOf(rating));
        }
        return ResponseEntity.ok().body(new ApiResponse<>("List of books", bookList));

    }





}
