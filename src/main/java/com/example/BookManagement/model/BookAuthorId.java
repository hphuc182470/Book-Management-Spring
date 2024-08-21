package com.example.BookManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BookAuthorId implements java.io.Serializable {
    private static final long serialVersionUID = 5423730741386273357L;
    @Column(name = "bookID", nullable = false)
    private Integer bookID;

    @Column(name = "authorID", nullable = false)
    private Integer authorID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookAuthorId entity = (BookAuthorId) o;
        return Objects.equals(this.authorID, entity.authorID) &&
                Objects.equals(this.bookID, entity.bookID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorID, bookID);
    }

}