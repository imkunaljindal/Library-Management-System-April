package com.example.librarymanagementsystemapril.repository;

import com.example.librarymanagementsystemapril.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
