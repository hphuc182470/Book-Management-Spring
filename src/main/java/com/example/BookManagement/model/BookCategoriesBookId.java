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
public class BookCategoriesBookId implements java.io.Serializable {
    private static final long serialVersionUID = 5011454022994117139L;
    @Column(name = "bookID", nullable = false)
    private Integer bookID;

    @Column(name = "categoryID", nullable = false)
    private Integer categoryID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookCategoriesBookId entity = (BookCategoriesBookId) o;
        return Objects.equals(this.categoryID, entity.categoryID) &&
                Objects.equals(this.bookID, entity.bookID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID, bookID);
    }

}