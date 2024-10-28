package com.suraj.spring_boot_Course.controller;

import com.suraj.spring_boot_Course.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//controller
@RestController
public class CourseController {

    //http://localhost:8080/course
    @RequestMapping("/course")
    public List<Course> getAllCourse(){
        return Arrays.asList(
                new Course(101,"spring boot","suraj"),
                new Course(102,"spring MVC","suraj"),
                new Course(103,"spring Security","suraj")
        );
    }
}
