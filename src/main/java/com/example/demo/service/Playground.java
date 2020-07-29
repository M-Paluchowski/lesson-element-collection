package com.example.demo.service;

import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Playground {

    private final AuthorRepository authorRepository;

    @Autowired
    public Playground(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void run() {

    }
}
