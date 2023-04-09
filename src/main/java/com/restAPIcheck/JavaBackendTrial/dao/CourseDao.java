package com.restAPIcheck.JavaBackendTrial.dao;

import com.restAPIcheck.JavaBackendTrial.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseDao extends MongoRepository<Course,Long> {
}
