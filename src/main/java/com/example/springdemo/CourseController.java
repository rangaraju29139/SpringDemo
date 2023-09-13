package com.example.springdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController
{

    @RequestMapping("/all")
    public List<Course> retrieveAllCourses(){

        return Arrays.asList(
                new Course(1,"learn Aws","in28minutes"),
        new Course(2,"learn azure devops","in28minutes"),
        new Course(2,"learn google cloud","in28minutes")
        );
    }
}
