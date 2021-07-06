package com.epam.testapp.model.mapper;

import com.epam.testapp.model.dto.NewsDTO;
import com.epam.testapp.model.entity.News;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class NewsMapper {

    public News toEntity(NewsDTO dto) {
        if (dto == null) {
            return null;
        } else {
            return new News(dto.getId(), dto.getTitle(), dto.getBrief(), dto.getContent(), dto.getDate());
        }
    }

    public NewsDTO toDTO(News entity) {
        if (entity == null) {
            return null;
        } else {
            return NewsDTO.builder()
                    .id(entity.getId())
                    .brief(entity.getBrief())
                    .content(entity.getContent())
                    .title(entity.getTitle())
                    .date(entity.getDate())
                    .build();
        }
    }
}
