package com.elyashevich.auth.controller;

import com.elyashevich.auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping("/home")
    public String getAllUsers(final Model model) {
        model.addAttribute("user", userService.findCurrentUser());
        return "home";
    }
}
