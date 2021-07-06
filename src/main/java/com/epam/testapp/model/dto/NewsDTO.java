package com.epam.testapp.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class NewsDTO {
    Long id;
    String title;
    String brief;
    String content;
    Date date;
}
