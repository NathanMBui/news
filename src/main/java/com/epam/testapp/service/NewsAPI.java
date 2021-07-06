package com.epam.testapp.service;

import com.epam.testapp.model.dto.NewsDTO;

import java.util.List;
import java.util.function.Predicate;

public interface NewsAPI {
    NewsDTO insert(NewsDTO news);
    NewsDTO update(NewsDTO news);
    boolean delete(int newsId);
    NewsDTO get(int newsId);
    List<NewsDTO> get(Predicate<NewsDTO> criteria);
}
