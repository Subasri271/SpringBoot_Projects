package com.example.Full_Stack_Project1;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Students_Data")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name="student_name",nullable = false,length=10)
    private String name;
    @Column(name = "student_dept",nullable = false,length=1)
    private String department;
}
