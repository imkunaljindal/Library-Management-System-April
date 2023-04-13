package com.example.librarymanagementsystemapril.service;

import com.example.librarymanagementsystemapril.DTO.ResponseDto.AuthorResponseDto;
import com.example.librarymanagementsystemapril.entity.Author;

public interface AuthorService {

    public String addAuthor(Author author);
    public AuthorResponseDto getByEmail(String email);
}
