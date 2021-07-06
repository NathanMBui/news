package com.epam.testapp.config;

import com.epam.testapp.database.NewsRepository;
import com.epam.testapp.model.entity.News;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(NewsRepository repository) {
        return args -> {
            repository.save(new News(-1L, "title", "brief", "content", new Date()));
        };
    }
}
