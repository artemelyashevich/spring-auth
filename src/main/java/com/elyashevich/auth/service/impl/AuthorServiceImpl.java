package com.elyashevich.auth.service.impl;

import com.elyashevich.auth.dto.AuthorDto;
import com.elyashevich.auth.model.Author;
import com.elyashevich.auth.repo.AuthorRepo;
import com.elyashevich.auth.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;

    @Override
    public void create(AuthorDto authorDto) {
        final Author author = Author
                .builder()
                .name(authorDto.getName())
                .birthday(authorDto.getBirthday())
                .build();
        authorRepo.save(author);
    }

    @Override
    public List<Author> findAll() {
        return authorRepo.findAll();
    }

    @Override
    public Author findById(Long id) {
        return authorRepo.findById(id).orElseThrow();
    }

    @Override
    public void delete(String name) {
        final Author author = authorRepo.findByName(name);
        authorRepo.delete(author);
    }
}
