package com.example.MTS_Dz1.service;

import com.example.MTS_Dz1.model.Course;
import com.example.MTS_Dz1.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getCoursesByUser(Long userId) {
        log.info("CourseService: getCoursesByUser({})", userId);
        return courseRepository.findByUserId(userId);
    }
}
