package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class StudentService {

        public List<Student> getStudents(){
        return List.of(
                new Student(
                        1l,
                        "Paul",
                        "paul.kinsella@gmail.com",
                        21,
                        LocalDate.of(2000, Month.OCTOBER, 5)
                ),
                new Student(
                        2l,
                        "test",
                        "test@gmail.com",
                        21,
                        LocalDate.of(1984, Month.DECEMBER, 9)
                )
        );
    }
}
