package com.example.Student_db;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @OneToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long std_id;
    private String std_name;
    public Student(Long std_id,String std_name){
        this.std_id=std_id;
        this.std_name=std_name;
    }
    public Long getStd_id(){return std_id;}
    public String getStd_name(){return std_name;}
}
