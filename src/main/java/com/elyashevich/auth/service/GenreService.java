package com.elyashevich.auth.service;

import com.elyashevich.auth.dto.GenreDto;
import com.elyashevich.auth.model.Genre;

import java.util.List;

public interface GenreService {

    void create(GenreDto genreDto);

    Genre findById(Long id);

    Genre findByTitle(String title);

    List<Genre> findAll();

    void delete(String title);
}
