package com.epam.testapp.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "News")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class News {
    @Id
    @GeneratedValue
    Long id;
    String title;
    String brief;
    String content;
    Date date;
}
