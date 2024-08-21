package com.example.BookManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @Column(name = "bookID", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "libraryID")
    private Library libraryID;

    @Column(name = "publishedYear")
    private Integer publishedYear;

    @Column(name = "isbn", nullable = false, length = 13)
    private String isbn;

}