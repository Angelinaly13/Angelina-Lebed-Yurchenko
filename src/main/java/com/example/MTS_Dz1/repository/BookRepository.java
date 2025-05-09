package com.example.MTS_Dz1.repository;

import com.example.MTS_Dz1.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class BookRepository {

    public List<Book> findByUserId(Long userId) {
        log.info("BookRepository: findByUserId({})", userId);
        return List.of(
                new Book(1L, userId, "Java для чайников"),
                new Book(2L, userId, "Программирование с нуля до senior за неделю")
        );
    }
}
