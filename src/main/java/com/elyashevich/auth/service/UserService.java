package com.elyashevich.auth.service;

import com.elyashevich.auth.dto.UserDto;
import com.elyashevich.auth.model.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findCurrentUser();

    User findByEmail(String email);

    List<User> findAllUsers();
}
