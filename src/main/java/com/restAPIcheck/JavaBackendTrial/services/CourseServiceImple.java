package com.restAPIcheck.JavaBackendTrial.services;

import com.restAPIcheck.JavaBackendTrial.dao.CourseDao;
import com.restAPIcheck.JavaBackendTrial.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImple implements CourseService{
    @Autowired
    private CourseDao courseDao;
//    List<Course>list;
    public CourseServiceImple(){
//        list=new ArrayList<>();
//        list.add(new Course(145,"Java Stuff","Exactly dude now Java Stuffs description"));
//        list.add(new Course(147,"More Java Stuff","Naah dude now More Java Stuffs description"));
    }
    @Override
    public ResponseEntity<?> getCourses(){
//        System.out.println(this.courseDao.findAll());
        return ResponseEntity.ok(this.courseDao.findAll());
    }
    @Override
    public ResponseEntity<?> getCourse(long courseId){
        return ResponseEntity.ok(this.courseDao.findById(courseId));
//        Course c=null;
//        for(Course x:list){
//            if(x.getId()==courseId){
//                c=x;
//                break;
//            }
//        }
//        return c;
    }
    @Override
    public Course addCourse(Course course){
//        list.add(course);
        Course save=this.courseDao.save(course);
        return save;
    }
    @Override
    public Course updateCourse(Course course){
//        for(Course x:list){
//            if(course.getId()==x.getId()){
//                x.setDescription(course.getDescription());
//                x.setTitle(course.getTitle());
//            }
//        }
        Course save=this.courseDao.save(course);
        return save;
    }
    @Override
    public void deleteCourse(long parseLong){
        this.courseDao.deleteById(parseLong);
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }
}
