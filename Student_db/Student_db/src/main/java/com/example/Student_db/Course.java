package com.example.Student_db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;
    private String course_name;
    private Long std_id;
    public Student(Long course_id,String course_name){
        this.course_id=course_id;
        this.course_name=course_name;
    }
    public Long getStd_id(){return course_id;}
    public String getStd_name(){return course_name;}
}
