package com.epam.testapp.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "News")
@Setter
@Getter
@Builder
public class News {
    @Id
    int id;
    String title;
    String brief;
    String content;
    Date date;
}
