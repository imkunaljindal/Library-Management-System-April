package com.example.librarymanagementsystemapril.service;

import com.example.librarymanagementsystemapril.DTO.RequestDto.StudentRequestDto;
import com.example.librarymanagementsystemapril.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.librarymanagementsystemapril.DTO.ResponseDto.StudentResponseDto;
import com.example.librarymanagementsystemapril.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.librarymanagementsystemapril.entity.Student;
import com.example.librarymanagementsystemapril.exceptions.StudentNotFoundException;

public interface StudentService {

    public String addStudent(StudentRequestDto studentRequestDto);

    public StudentResponseDto getStudentById(int id);
    public UpdateStudentMobNoResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException;
}
