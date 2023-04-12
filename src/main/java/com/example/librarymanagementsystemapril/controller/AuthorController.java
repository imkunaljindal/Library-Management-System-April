package com.example.librarymanagementsystemapril.controller;

import com.example.librarymanagementsystemapril.entity.Author;
import com.example.librarymanagementsystemapril.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    // delete a student by id

    // update the student by id

    // find a student by id

    // find all the students
}
