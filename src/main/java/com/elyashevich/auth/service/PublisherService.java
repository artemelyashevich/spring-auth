package com.elyashevich.auth.service;

import com.elyashevich.auth.dto.PublisherDto;
import com.elyashevich.auth.model.Publisher;

import java.util.List;

public interface PublisherService {

    void create(PublisherDto publisherDto);

    List<Publisher> findAll();
}
