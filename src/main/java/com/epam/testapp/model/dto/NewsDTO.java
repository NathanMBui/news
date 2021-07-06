package com.epam.testapp.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class NewsDTO {
    String title;
    String brief;
    String content;
    Date date;
}
