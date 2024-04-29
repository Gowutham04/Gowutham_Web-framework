package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GowAuthor;
import com.example.q1.model.GowBook;
import com.example.q1.repository.GowAuthorRepository;
import com.example.q1.repository.GowBookRepository;

@Service
public class BookService {
    @Autowired
    private GowBookRepository bookRepository;
@Autowired
private GowAuthorRepository authorRepository;
    public GowBook saveBook(Long authorId, GowBook book) {
        GowAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public GowBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

