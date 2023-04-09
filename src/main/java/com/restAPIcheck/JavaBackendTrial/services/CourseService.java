package com.restAPIcheck.JavaBackendTrial.services;

import com.restAPIcheck.JavaBackendTrial.entity.Course;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseService {
    public ResponseEntity<?> getCourses();
    public ResponseEntity<?> getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);
}
