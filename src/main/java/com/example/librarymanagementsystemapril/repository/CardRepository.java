package com.example.librarymanagementsystemapril.repository;

import com.example.librarymanagementsystemapril.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
