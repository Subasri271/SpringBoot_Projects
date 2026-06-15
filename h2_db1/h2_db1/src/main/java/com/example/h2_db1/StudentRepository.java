package com.example.h2_db1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {}

//explanaton
//*JpaRepository <Student ,Long>
//JpaRepository is a Spring Data JPA interface that already has all the common CRUD methods built in.
//*By extending it ,your StudentRepository automatically gets methods like:
//save(Student s)-> insert/update a student
//findAll() -> get all Students
//findById(Long id)-> get one student
//deleteById(Long id)->delete a Student
//You don't need to write SQL or implement these methods yourself -Spring gennerates them at runtime.
/*
2.<Student ,Long>
The first tyoe parameter (Student)tells JPA which entity this repository manages.
-> It's tied to your Student table.
The second type parameter (Long ) tells JPA the tyoe of the primary key(id).
-> Since your Student entity has private Long id;,ypu spcify Long.

3.public interface StudentRepository
It's an interface ,not a class.
You don't write any code inside -Spring Boot automatically creates a working implementation at runtime.
*/