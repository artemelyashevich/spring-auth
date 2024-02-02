package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.GenreDto;
import com.elyashevich.auth.service.GenreService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @PostMapping("/genre")
    public String saveGenre(final @Valid @ModelAttribute("genreDto") GenreDto genreDto){
        genreService.create(genreDto);
        return "redirect:/directory/genres";
    }
}
