package com.example.BookManagement.repositories;

import com.example.BookManagement.model.BookCategoriesBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoriesBookRepository extends JpaRepository<BookCategoriesBook, Long> {
}
