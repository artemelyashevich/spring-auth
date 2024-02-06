package com.elyashevich.auth.service.impl;

import com.elyashevich.auth.dto.PublisherDto;
import com.elyashevich.auth.model.Publisher;
import com.elyashevich.auth.repo.PublisherRepo;
import com.elyashevich.auth.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepo publisherRepo;

    @Override
    public void create(PublisherDto publisherDto) {
        final Publisher publisher = Publisher
                .builder()
                .name(publisherDto.getName())
                .build();
        publisherRepo.save(publisher);
    }

    @Override
    public List<Publisher> findAll() {
        return publisherRepo.findAll();
    }

    @Override
    public Publisher findById(Long id) {
        return publisherRepo.findById(id).orElseThrow();
    }
}
