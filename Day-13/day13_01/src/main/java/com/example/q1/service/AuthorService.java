package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GowAuthor;
import com.example.q1.repository.GowAuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private GowAuthorRepository authorRepository;

    public GowAuthor saveAuthor(GowAuthor author) {
        return authorRepository.save(author);
    }

    public GowAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<GowAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public GowAuthor updateAuthor(Long id, GowAuthor author) {
        GowAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
