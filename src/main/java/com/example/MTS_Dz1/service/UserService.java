package com.example.MTS_Dz1.service;

import com.example.MTS_Dz1.model.User;
import com.example.MTS_Dz1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        log.info("UserService: getAllUsers()");
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        log.info("UserService: getUserById({})", id);
        return userRepository.findById(id);
    }
}
