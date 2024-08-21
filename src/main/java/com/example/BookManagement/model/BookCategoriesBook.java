package com.example.BookManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "BookCategoriesBooks")
public class BookCategoriesBook {
    @EmbeddedId
    private BookCategoriesBookId id;

    @MapsId("bookID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bookID", nullable = false)
    private Book bookID;

    @MapsId("categoryID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoryID", nullable = false)
    private BookCategory categoryID;

}