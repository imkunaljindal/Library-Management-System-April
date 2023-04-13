package com.example.librarymanagementsystemapril.controller;

import com.example.librarymanagementsystemapril.DTO.RequestDto.StudentRequestDto;
import com.example.librarymanagementsystemapril.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.librarymanagementsystemapril.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.librarymanagementsystemapril.entity.Student;
import com.example.librarymanagementsystemapril.exceptions.StudentNotFoundException;
import com.example.librarymanagementsystemapril.repository.StudentRepository;
import com.example.librarymanagementsystemapril.service.StudentService;
import com.example.librarymanagementsystemapril.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){

        return studentService.addStudent(studentRequestDto);
    }

    @PutMapping("/update_mobile")
    public UpdateStudentMobNoResponseDto updateMobNo(@RequestBody UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {

        return studentService.updateMobNo(updateStudentMobRequestDto);
    }

    // delete a student by id

    // update the student by id

    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("id") int id){
        return studentService.getStudentById(id);
    }

    // find all the students
}
