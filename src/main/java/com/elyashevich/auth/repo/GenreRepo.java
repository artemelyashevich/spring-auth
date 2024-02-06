package com.elyashevich.auth.repo;

import com.elyashevich.auth.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Long> {

    Genre findByTitle(String title);
}