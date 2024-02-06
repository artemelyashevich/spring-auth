package com.elyashevich.auth.service;

import com.elyashevich.auth.dto.AuthorDto;
import com.elyashevich.auth.model.Author;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AuthorService {

    void create(AuthorDto authorDto);

    List<Author> findAll();

    Author findById(Long id);

    void delete(String name);
}
