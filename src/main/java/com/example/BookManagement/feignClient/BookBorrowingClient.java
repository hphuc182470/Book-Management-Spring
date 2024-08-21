package com.example.BookManagement.feignClient;

import com.example.BookManagement.model.BookBorrowing;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "BORROW-SERVICE", url = "http://localhost:8081", path = "/borrow")
public interface BookBorrowingClient {

    @GetMapping("/getBookBorrowingByUserId/{userID}")
    ResponseEntity<List<BookBorrowing>> findByUserID(@PathVariable("userID") Long userID);

    @GetMapping("/getBookBorrowingByBookID/{bookID}")
    ResponseEntity<BookBorrowing> findByBookID(@PathVariable("bookID") Long bookID);
}
