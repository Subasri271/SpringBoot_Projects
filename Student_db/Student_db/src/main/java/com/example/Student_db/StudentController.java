package com.example.Student_db;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentdb")

public class StudentController {
    private final StudentRepository srepo=new StudentRepository();
    @GetMapping
    public List<Student> getStudents(){
        return srepo.findAll();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s) {
        srepo.save(s);
        return s;
    }
}
