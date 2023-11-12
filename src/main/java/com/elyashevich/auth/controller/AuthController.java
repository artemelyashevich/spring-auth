package com.elyashevich.auth.controller;

import com.elyashevich.auth.dto.UserDto;
import com.elyashevich.auth.model.User;
import com.elyashevich.auth.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String getLoginForm(final Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String getRegistrationForm(final Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "register";
    }

    @PostMapping("/register/save")
    public String registration(
            final @Valid @ModelAttribute("user") UserDto userDto,
            final BindingResult result,
            final Model model
    ) {
        User user = userService.findByEmail(userDto.getEmail());
        if (user != null && user.getEmail() != null && !user.getEmail().isEmpty()) {
            result.rejectValue(
                    "email",
                    null,
                    "There is already an account registered with the same email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userDto);
            return "/register";
        }
        userService.saveUser(userDto);
        return "redirect:/register?success";
    }
}
