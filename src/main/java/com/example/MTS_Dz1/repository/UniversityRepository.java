package com.example.MTS_Dz1.repository;

import com.example.MTS_Dz1.model.University;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class UniversityRepository {

    public List<University> findByUserId(Long userId) {
        log.info("UniversityRepository: findByUserId({})", userId);
        return List.of(
                new University(1L, userId, "MIPT", "Dolgoprudny"),
                new University(2L, userId, "MSU", "Moscow")
        );
    }
}
