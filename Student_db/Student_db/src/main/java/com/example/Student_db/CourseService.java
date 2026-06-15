package com.example.Student_db;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();
    private int courseid = 1;
    public Course course_auto( Course cr_id) {
        cr_id.Course(courseid++);
        courses.add(cr_id);
        return cr_id;
    }
    public List<Course> getOrders() {
        return courses;
    }

}
