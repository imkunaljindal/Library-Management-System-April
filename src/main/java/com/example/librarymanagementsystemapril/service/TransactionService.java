package com.example.librarymanagementsystemapril.service;

import com.example.librarymanagementsystemapril.DTO.RequestDto.IssueBookRequestDto;
import com.example.librarymanagementsystemapril.DTO.ResponseDto.IssueBookResponseDto;

public interface TransactionService {

    public IssueBookResponseDto issueBook(IssueBookRequestDto issueBookRequestDto) throws Exception;
}
