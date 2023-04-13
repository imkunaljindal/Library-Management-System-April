package com.example.librarymanagementsystemapril.controller;

import com.example.librarymanagementsystemapril.DTO.ResponseDto.AuthorResponseDto;
import com.example.librarymanagementsystemapril.entity.Author;
import com.example.librarymanagementsystemapril.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/get_by_email")
    public AuthorResponseDto getAuthorByEmail(@RequestParam("email") String email){

        return authorService.getByEmail(email);
    }
    // delete a student by id

    // update the student by id

    // find a student by id

    // find all the students

    // get all the authors of a particular age
}
