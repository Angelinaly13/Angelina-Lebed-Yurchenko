package com.example.MTS_Dz1.service;

import com.example.MTS_Dz1.model.Book;
import com.example.MTS_Dz1.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooksByUser(Long userId) {
        log.info("BookService: getBooksByUser({})", userId);
        return bookRepository.findByUserId(userId);
    }
}
