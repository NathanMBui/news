package com.epam.testapp.service;

import com.epam.testapp.database.NewsRepository;
import com.epam.testapp.model.dto.NewsDTO;
import com.epam.testapp.model.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NewsService implements NewsAPI {

    @Autowired
    private NewsRepository repository;

    @Autowired
    private NewsMapper mapper;

    @Override
    public NewsDTO insert(NewsDTO news) {
        var entity = repository.save(mapper.toEntity(news));
        return mapper.toDTO(entity);
    }

    @Override
    public NewsDTO update(NewsDTO news) {
        var entity = mapper.toEntity(news);
        var result = repository.save(entity);
        return mapper.toDTO(result);
    }

    @Override
    public void delete(long newsId) {
        repository.deleteById(newsId);
    }

    @Override
    public Optional<NewsDTO> get(long newsId) {
        var entity = repository.findById(newsId);
        return Optional.ofNullable(mapper.toDTO(entity.orElse(null)));
    }

    @Override
    public List<NewsDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
    }
}
