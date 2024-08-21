package com.example.BookManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "BookCategories")
public class BookCategory {
    @Id
    @Column(name = "categoryID", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

}