package com.elyashevich.auth.repo;

import com.elyashevich.auth.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
