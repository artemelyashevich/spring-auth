package com.elyashevich.auth.service;

import com.elyashevich.auth.dto.BookDto;
import com.elyashevich.auth.model.Book;

import java.util.List;

public interface BookService {

    void create(BookDto bookDto);

    List<Book> findAll();

    Book findById();
}
