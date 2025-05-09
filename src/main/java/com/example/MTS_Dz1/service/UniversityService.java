package com.example.MTS_Dz1.service;

import com.example.MTS_Dz1.model.University;
import com.example.MTS_Dz1.repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UniversityService {

    private final UniversityRepository universityRepository;

    public List<University> getUniversitiesByUser(Long userId) {
        log.info("UniversityService: getUniversitiesByUser({})", userId);
        return universityRepository.findByUserId(userId);
    }
}
