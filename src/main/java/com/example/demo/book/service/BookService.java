package com.example.demo.book.service;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.db.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepoistory;

    //create, update
    public BookEntity create(BookEntity book) {
        return bookRepoistory.save(book);
    }

    // all
    public List<BookEntity> findAll() {
        return bookRepoistory.findAll();
    }

    //delete

    //findOne


}
