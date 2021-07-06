package com.epam.testapp.presentation.action;

import com.epam.testapp.model.dto.NewsDTO;
import com.epam.testapp.service.NewsAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NewsController {

    @Autowired
    private NewsAPI api;

    @GetMapping("/news")
    public ResponseEntity<List<NewsDTO>> get() {
        return ResponseEntity.ok(api.getAll());
    }

    @GetMapping("/news/{id}")
    public ResponseEntity<NewsDTO> getById(@PathVariable int id) {
        return ResponseEntity.of(api.get(id));
    }

    @PostMapping("/news")
    public ResponseEntity<NewsDTO> create(@RequestBody NewsDTO news) {
        return ResponseEntity.ok(api.insert(news));
    }

    @PutMapping("/news")
    public ResponseEntity<NewsDTO> update(@RequestBody NewsDTO news) {
        return ResponseEntity.ok(api.update(news));
    }

    @DeleteMapping("/news/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        api.delete(id);
        return ResponseEntity.ok().build();
    }
}
