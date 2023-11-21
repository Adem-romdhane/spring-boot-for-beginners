package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "adam",
                        "romdhane",
                        LocalDate.now(),
                        "contact@adamcoding.com",
                        34
                ),
                new Student(
                        "mohamed",
                        "romdhane",
                        LocalDate.now(),
                        "contact@mohamed.com",
                        44)
        );
    }
}
