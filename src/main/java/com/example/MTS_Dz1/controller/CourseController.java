package com.example.MTS_Dz1.controller;

import com.example.MTS_Dz1.model.Course;
import com.example.MTS_Dz1.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/courses")
@RequiredArgsConstructor
@Slf4j
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public List<Course> getCoursesForUser(@PathVariable Long userId) {
        log.info("GET /users/{}/courses", userId);
        return courseService.getCoursesByUser(userId);
    }
}
