package com.example.BookManagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "BookAuthors")
public class BookAuthor {
    @EmbeddedId
    private BookAuthorId id;

    @MapsId("bookID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bookID", nullable = false)
    private Book bookID;

    @MapsId("authorID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "authorID", nullable = false)
    private Author authorID;

}