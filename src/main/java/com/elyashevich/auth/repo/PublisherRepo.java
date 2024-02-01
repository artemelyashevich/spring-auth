package com.elyashevich.auth.repo;

import com.elyashevich.auth.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher, Long> {
}