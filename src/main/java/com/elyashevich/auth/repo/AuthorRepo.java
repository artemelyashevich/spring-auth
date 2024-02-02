package com.elyashevich.auth.repo;

import com.elyashevich.auth.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {

    Author findByName(String name);
}
