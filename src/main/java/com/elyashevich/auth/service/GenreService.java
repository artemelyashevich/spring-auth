package com.elyashevich.auth.service;

import com.elyashevich.auth.dto.GenreDto;
import com.elyashevich.auth.model.Genre;

import java.util.List;

public interface GenreService {

    void create(GenreDto genreDto);

    List<Genre> findAll();
}
