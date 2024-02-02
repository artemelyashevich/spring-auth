package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.PublisherDto;
import com.elyashevich.auth.service.PublisherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;

    @PostMapping("/publisher")
    public String savePublisher(final @Valid @ModelAttribute("publisherDto")PublisherDto publisherDto) {
        publisherService.create(publisherDto);
        return "redirect:/directory/publishers";
    }
}
