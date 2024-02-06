package com.elyashevich.auth.service.impl;

import com.elyashevich.auth.dto.GenreDto;
import com.elyashevich.auth.model.Genre;
import com.elyashevich.auth.repo.GenreRepo;
import com.elyashevich.auth.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepo genreRepo;

    @Override
    public void create(GenreDto genreDto) {
        final Genre genre = Genre
                .builder()
                .title(genreDto.getName())
                .build();
        genreRepo.save(genre);
    }

    @Override
    public Genre findById(Long id) {
        return genreRepo.findById(id).orElseThrow();
    }

    @Override
    public Genre findByTitle(String title) {
        return genreRepo.findByTitle(title);
    }

    @Override
    public List<Genre> findAll() {
        return genreRepo.findAll();
    }

    @Override
    public void delete(String title) {
        final Genre genre = genreRepo.findByTitle(title);
        genreRepo.delete(genre);
    }
}
