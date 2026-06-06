package com.project1.springproject.services;

import org.springframework.stereotype.Service;

import com.project1.springproject.model.Student;

@Service
public class StudentServices {
      public Student getStudent() {
        return new Student(2, "Rahim", "rahim@example.com");
    }
}
