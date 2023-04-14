package com.example.librarymanagementsystemapril.DTO.ResponseDto;

import com.example.librarymanagementsystemapril.enums.CardStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardResponseDto {

    private int id;

    private Date issueDate;

    private Date updatedOn;

    private CardStatus cardStatus;

    private String validTill;
}
