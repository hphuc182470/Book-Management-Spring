package com.example.BookManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BookBorrowingId implements Serializable {
    private static final long serialVersionUID = -304828375506807098L;
    @NotNull
    @Column(name = "bookID", nullable = false)
    private Integer bookID;

    @NotNull
    @Column(name = "userID", nullable = false)
    private Integer userID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookBorrowingId entity = (BookBorrowingId) o;
        return Objects.equals(this.userID, entity.userID) &&
                Objects.equals(this.bookID, entity.bookID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, bookID);
    }

}