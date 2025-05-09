package com.example.MTS_Dz1.repository;

import com.example.MTS_Dz1.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class UserRepository {

    public List<User> findAll() {
        log.info("UserRepository: findAll()");
        return List.of(
                new User(1L, "Angelina", "lebed-iurchenko.av@phystech.edu"),
                new User(2L, "Ivan", "ivan.bezdelnik@mail.ru")
        );
    }

    public User findById(Long id) {
        log.info("UserRepository: findById({})", id);
        return new User(id, "MockName", "mock@email.com");
    }
}
