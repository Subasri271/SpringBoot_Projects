package com.example.Student_db;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Course> students = new ArrayList<>();
    private int idCounter = 1;
    public Student stdid( Student id) {
        id.(idCounter++);
        id.add(id);
        return id;
    }
    public List<Student> getid() {
        return students;
    }
}
