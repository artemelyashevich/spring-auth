package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.BookDto;
import com.elyashevich.auth.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public String create(final @Valid @ModelAttribute("bookDto")BookDto bookDto) {
        bookService.create(bookDto);
        return "redirect:/home";
    }
}
