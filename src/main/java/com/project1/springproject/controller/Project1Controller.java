package com.project1.springproject.controller;

import com.project1.springproject.model.Student;
import com.project1.springproject.services.StudentServices;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Tag(name = "Student APIs")
public class Project1Controller {
  private final StudentServices studentServices;
   

  public Project1Controller(StudentServices studentServices){
      this.studentServices = studentServices;

  }
   
    @GetMapping("/student")
    public Student getStudent(){
        return  studentServices.getStudent();
    }
}