/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import wad.domain.News;
import wad.repository.NewsRepository;

/**
 *
 * @author Jaakko
 */
@Controller
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("listOfNews", newsRepository.findAll());
        return "index";
    }

    @PostMapping
    public String create(@RequestParam String name) {
        News n = new News();
        n.setName(name);
        newsRepository.save(n);
        
        return "redirect:/";
    }

}
