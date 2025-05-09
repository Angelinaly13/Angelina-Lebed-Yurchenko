package com.example.MTS_Dz1.controller;

import com.example.MTS_Dz1.model.Book;
import com.example.MTS_Dz1.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/books")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getBooksForUser(@PathVariable Long userId) {
        log.info("GET /users/{}/books", userId);
        return bookService.getBooksByUser(userId);
    }
}
