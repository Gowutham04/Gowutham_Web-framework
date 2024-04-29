package com.example.gowday14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gowday14ce2.model.GowBook;
import com.example.gowday14ce2.service.GowBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class GowBookController {
    @Autowired
    GowBookService bookService;

    @PostMapping("/api/book")
    public GowBook addBook(@RequestBody GowBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public GowBook updateBook(@PathVariable int id,@RequestBody GowBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<GowBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<GowBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
