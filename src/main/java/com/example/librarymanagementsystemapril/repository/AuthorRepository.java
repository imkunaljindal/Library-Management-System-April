package com.example.librarymanagementsystemapril.repository;

import com.example.librarymanagementsystemapril.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
