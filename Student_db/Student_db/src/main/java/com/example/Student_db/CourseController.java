package com.example.Student_db;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/studentdb")

public class CourseController {
    private final CourseRepository crepo=new CourseRepository();
    @GetMapping
    public List<Course> getCourse(){
        return crepo.findAll();
    }
    @PostMapping
    public Course addCourse(@RequestBody Course c) {
        crepo.save(c);
        return c;
    }
}
