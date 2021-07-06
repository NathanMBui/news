package com.epam.testapp.service;

import com.epam.testapp.database.NewsRepository;
import com.epam.testapp.model.dto.NewsDTO;
import com.epam.testapp.model.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class NewsService implements NewsAPI {

    @Autowired
    private NewsRepository repository;

    @Autowired
    private NewsMapper mapper;

    @Override
    public NewsDTO insert(NewsDTO dto) {
        var entity = repository.save(mapper.toEntity(dto));
        return mapper.toDTO(entity);
    }

    @Override
    public NewsDTO update(NewsDTO news) {
        return null;
    }

    @Override
    public boolean delete(int newsId) {
        return false;
    }

    @Override
    public NewsDTO get(int newsId) {
        return null;
    }

    @Override
    public List<NewsDTO> get(Predicate<NewsDTO> criteria) {
        return null;
    }
}
