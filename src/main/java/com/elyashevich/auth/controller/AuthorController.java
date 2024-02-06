package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.AuthorDto;
import com.elyashevich.auth.model.Author;
import com.elyashevich.auth.service.AuthorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    public String saveAuthor(final @Valid @ModelAttribute("authorDto") AuthorDto authorDto) {
        authorService.create(authorDto);
        return "redirect:/directory/authors";
    }

    @DeleteMapping("/{name}")
    public String deleteAuthor(final @PathVariable String name) {
        authorService.delete(name);
        return "redirect:/directory/authors";
    }
}
