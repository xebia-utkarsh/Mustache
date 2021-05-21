package com.example.MustacheIntro.api;

import com.example.MustacheIntro.DTO.ArticleDTO;
import com.example.MustacheIntro.service.ArticleDisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class ArticleAPI {
    @Autowired
    ArticleDisplayService articleDisplayService;

    @GetMapping("/article")
    public ModelAndView displayArticle(Model model) {

        List<ArticleDTO> articles = IntStream.range(0, 5)
                .mapToObj(i -> articleDisplayService.generateArticle(i))
                .collect(Collectors.toList());

        model.addAttribute("articles", articles);

        return new ModelAndView("article");
    }


}
