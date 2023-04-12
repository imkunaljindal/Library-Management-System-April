package com.example.librarymanagementsystemapril.controller;

import com.example.librarymanagementsystemapril.entity.Student;
import com.example.librarymanagementsystemapril.service.StudentService;
import com.example.librarymanagementsystemapril.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }

    // delete a student by id

    // update the student by id

    // find a student by id

    // find all the students
}
