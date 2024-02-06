package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.GenreDto;
import com.elyashevich.auth.service.GenreService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/genre")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @PostMapping
    public String saveGenre(final @Valid @ModelAttribute("genreDto") GenreDto genreDto){
        genreService.create(genreDto);
        return "redirect:/directory/genres";
    }

    @DeleteMapping("/{title}")
    public String deleteGenre(final @PathVariable String title) {
        genreService.delete(title);
        return "redirect:/directory/genres";
    }
}
