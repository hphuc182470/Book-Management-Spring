package com.example.BookManagement.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingDTO {
    private Integer bookId;
    private Integer userID;
}
