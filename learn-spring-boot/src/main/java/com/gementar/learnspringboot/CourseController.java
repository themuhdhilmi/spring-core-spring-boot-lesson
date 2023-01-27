package com.gementar.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class CourseController
{
    // /courses
    // Course: id, name, author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()
    {

//        List<Course> course = new ArrayList<>();
//
//
//        for (int i = 0; i < 100; i++)
//        {
//            course.add(new Course(i, "Learn AWS", "gementar"));
//        }
//
//        return course;

        return Arrays.asList(
                new Course(1, "Learn AWS", "gementar"),
                new Course(2, "Learn Dev", "gementar"),
                new Course(3, "Learn Game", "gementar")
        );
    }
}
