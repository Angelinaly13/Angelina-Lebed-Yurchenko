package com.example.MTS_Dz1.repository;

import com.example.MTS_Dz1.model.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class CourseRepository {

    public List<Course> findByUserId(Long userId) {
        log.info("CourseRepository: findByUserId({})", userId);
        return List.of(
                new Course(1L, userId, "Java Basics", "Intro to Java"),
                new Course(2L, userId, "Spring Boot", "Backend with Spring")
        );
    }
}
