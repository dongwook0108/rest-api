package com.example.demo.book.controller;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;

    @PostMapping("/create")
    public BookEntity create(@RequestBody BookEntity book) {
        return bookService.create(book);
    }

    @GetMapping("/find-all")
    public List<BookEntity> findAll() {
        return bookService.findAll();
    }


}
