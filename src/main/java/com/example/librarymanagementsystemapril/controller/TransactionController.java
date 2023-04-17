package com.example.librarymanagementsystemapril.controller;

import com.example.librarymanagementsystemapril.DTO.RequestDto.IssueBookRequestDto;
import com.example.librarymanagementsystemapril.DTO.ResponseDto.IssueBookResponseDto;
import com.example.librarymanagementsystemapril.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/add")
    public IssueBookResponseDto issueBook(@RequestBody IssueBookRequestDto issueBookRequestDto) throws Exception {

        return transactionService.issueBook(issueBookRequestDto);
    }
}
