package com.example.librarymanagementsystemapril.service.impl;

import com.example.librarymanagementsystemapril.entity.Card;
import com.example.librarymanagementsystemapril.entity.Student;
import com.example.librarymanagementsystemapril.enums.CardStatus;
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
    public String addStudent(Student student) {


        // generate a new card for the student
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setValidTill("2024-01-01");
        card.setStudent(student);

        // set card for the student
        student.setCard(card);
        studentRepository.save(student);
        return "Student added";
    }
}
