package com.elyashevich.auth.service.impl;

import com.elyashevich.auth.dto.BookDto;
import com.elyashevich.auth.model.Book;
import com.elyashevich.auth.repo.BookRepo;
import com.elyashevich.auth.service.AuthorService;
import com.elyashevich.auth.service.BookService;
import com.elyashevich.auth.service.GenreService;
import com.elyashevich.auth.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;
    private final GenreService genreService;
    private final AuthorService authorService;
    private final PublisherService publisherService;

    @Override
    public void create(BookDto bookDto) {
        final Book book = Book
                .builder()
                .title(bookDto.getTitle())
                .page_count(bookDto.getPageCount())
                .description(bookDto.getDescription())
                .genre(genreService.findById(bookDto.getGenreId()))
                .author(authorService.findById(bookDto.getAuthorId()))
                .publisher(publisherService.findById(bookDto.getPublisherId()))
                .build();
        bookRepo.save(book);
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById() {
        return null;
    }
}
