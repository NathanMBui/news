package com.epam.testapp.service;

import com.epam.testapp.model.dto.NewsDTO;

import java.util.List;
import java.util.Optional;

public interface NewsAPI {
    NewsDTO insert(NewsDTO news);
    NewsDTO update(NewsDTO news);
    void delete(long newsId);
    Optional<NewsDTO> get(long newsId);
    List<NewsDTO> getAll();
}
