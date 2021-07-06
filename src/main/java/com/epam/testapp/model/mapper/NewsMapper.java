package com.epam.testapp.model.mapper;

import com.epam.testapp.model.dto.NewsDTO;
import com.epam.testapp.model.entity.News;
import org.springframework.stereotype.Component;

@Component
public class NewsMapper {

    public News toEntity(NewsDTO dto) {
        return News.builder()
                .title(dto.getTitle())
                .brief(dto.getBrief())
                .content(dto.getContent())
                .date(dto.getDate())
                .build();
    }

    public NewsDTO toDTO(News entity) {
        return NewsDTO.builder()
                .id(entity.getId())
                .brief(entity.getBrief())
                .content(entity.getContent())
                .title(entity.getTitle())
                .build();
    }
}
