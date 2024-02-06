package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.AuthorDto;
import com.elyashevich.auth.dto.GenreDto;
import com.elyashevich.auth.dto.PublisherDto;
import com.elyashevich.auth.model.Author;
import com.elyashevich.auth.model.Genre;
import com.elyashevich.auth.model.Publisher;
import com.elyashevich.auth.model.User;
import com.elyashevich.auth.service.AuthorService;
import com.elyashevich.auth.service.GenreService;
import com.elyashevich.auth.service.PublisherService;
import com.elyashevich.auth.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/directory")
@RequiredArgsConstructor
public class AdminController {

    private final AuthorService authorService;
    private final UserService userService;
    private final GenreService genreService;
    private final PublisherService publisherService;

    @GetMapping("/authors")
    public String authorsPage(final Model model) {
        final AuthorDto authorDto = new AuthorDto();
        final User user = userService.findCurrentUser();
        final List<Author> authors = authorService.findAll();
        model.addAttribute("authors", authors);
        model.addAttribute("user", user);
        model.addAttribute("authorDto", authorDto);
        return "authors";
    }

    @GetMapping("/genres")
    public String genresPage(final Model model) {
        final GenreDto genreDto = new GenreDto();
        final User user = userService.findCurrentUser();
        final List<Genre> genres = genreService.findAll();
        model.addAttribute("user", user);
        model.addAttribute("genres", genres);
        model.addAttribute("genreDto", genreDto);
        return "genres";
    }

    @GetMapping("/publishers")
    public String publishersPage(final Model model) {
        final PublisherDto publisherDto = new PublisherDto();
        final User user = userService.findCurrentUser();
        final List<Publisher> publishers = publisherService.findAll();
        model.addAttribute("user", user);
        model.addAttribute("publishers", publishers);
        model.addAttribute("publisherDto", publisherDto);
        return "publishers";
    }
}
