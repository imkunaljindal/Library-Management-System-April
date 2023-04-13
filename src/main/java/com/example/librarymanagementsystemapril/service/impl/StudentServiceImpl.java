package com.example.librarymanagementsystemapril.service.impl;

import com.example.librarymanagementsystemapril.DTO.RequestDto.StudentRequestDto;
import com.example.librarymanagementsystemapril.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.librarymanagementsystemapril.DTO.ResponseDto.UpdateStudentMobNoResponseDto;
import com.example.librarymanagementsystemapril.entity.Card;
import com.example.librarymanagementsystemapril.entity.Student;
import com.example.librarymanagementsystemapril.enums.CardStatus;
import com.example.librarymanagementsystemapril.exceptions.StudentNotFoundException;
import com.example.librarymanagementsystemapril.repository.StudentRepository;
import com.example.librarymanagementsystemapril.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String addStudent(StudentRequestDto studentRequestDto) {

        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setName(studentRequestDto.getName());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setMobNo(studentRequestDto.getMobNo());

        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("2024-01-01");
        card.setStudent(student);

        student.setCard(card);
        studentRepository.save(student);

        return "Student added";
    }

    @Override
    public Student getStudentById(int id) {

        return studentRepository.findById(id).get();
    }

    @Override
    public UpdateStudentMobNoResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {

        try{
            Student student = studentRepository.findById(updateStudentMobRequestDto.getId()).get();
            student.setMobNo(updateStudentMobRequestDto.getMobNo());
            Student updatedStudent = studentRepository.save(student);

            // prepare response dto
            UpdateStudentMobNoResponseDto updateStudentMobNoResponseDto = new UpdateStudentMobNoResponseDto();
            updateStudentMobNoResponseDto.setName(updatedStudent.getName());
            updateStudentMobNoResponseDto.setMobNo(updateStudentMobRequestDto.getMobNo());
            return updateStudentMobNoResponseDto;
        }
        catch (Exception e){
            throw new StudentNotFoundException("Invalid student id");
        }
    }
}
