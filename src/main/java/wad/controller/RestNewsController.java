/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import wad.domain.News;
import wad.repository.NewsRepository;

/**
 *
 * @author Jaakko
 */
@RestController
public class RestNewsController {
    
        @Autowired
        private NewsRepository newsRepository;
        
        @GetMapping("/news")
        public List<News> list(Model model){
            return newsRepository.findAll();
        }
        
        @PostMapping("/news")
        public News add(@RequestBody News news){
            return newsRepository.save(news);
        }
}
