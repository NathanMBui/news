package com.epam.testapp.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class News {
    @Id
    int id;
    String title;
    String brief;
    String content;
    Date date;
}
