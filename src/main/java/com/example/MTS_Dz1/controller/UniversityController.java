package com.example.MTS_Dz1.controller;

import com.example.MTS_Dz1.model.University;
import com.example.MTS_Dz1.service.UniversityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/universities")
@RequiredArgsConstructor
@Slf4j
public class UniversityController {

    private final UniversityService universityService;

    @GetMapping
    public List<University> getUniversitiesForUser(@PathVariable Long userId) {
        log.info("GET /users/{}/universities", userId);
        return universityService.getUniversitiesByUser(userId);
    }

    @GetMapping("/{universityId}")
    public University getUniversityById(@PathVariable Long userId, @PathVariable Long universityId) {
        log.info("GET /users/{}/universities/{}", userId, universityId);
        return universityService.getUniversitiesByUser(userId)
                .stream()
                .filter(university -> university.getId().equals(universityId))
                .findFirst()
                .orElse(null);
    }
}
