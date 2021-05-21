package com.example.MustacheIntro.service;

import com.example.MustacheIntro.DTO.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleDisplayService {
    public ArticleDTO generateArticle(int id) {

        List<String> name = new ArrayList<>();
        name.add("Introduction to Java8");
        name.add("Introduction to Angular8");
        name.add("Understanding clean coding");
        name.add("Introduction to Mustache");
        name.add("Handlbars vs Mustache");

        List<String> content = new ArrayList<>();
        content.add("JAVA 8 is a major feature release of JAVA programming language development. Its initial version was released on 18 March 2014. With the Java 8 release, Java provided supports for functional programming, new JavaScript engine, new APIs for date time manipulation, new streaming API, etc.");
        content.add("Angular 8 is a popular, open-source, and TypeScript framework that is compiled into JavaScript. With the latest version of Angular known as Angular 8, dynamic web applications can be created. It has also introduced some extensive features as compared to the previous versions.");
        content.add("Clean Code refers to the act of writing code so that it cleans up leftover data structures and other unwanted materials from memory and the filesystem. It is sometimes treated as a synonym of refactoring code, which involves making the source code itself easier to understand, maintain, and modify.");
        content.add("Mustache is described as a \"logic-less\" system because it lacks any explicit control flow statements, like if and else conditionals or for loops; however, both looping and conditional evaluation can be achieved using section tags processing lists and lambdas.");
        content.add("Handlebars. js is an extension to the Mustache templating language created by Chris Wanstrath. ... js and Mustache are both logicless templating languages that keep the view and the code separated like we all know they should be; Mustache: Logic-less templates. Mustache is a logic-less template syntax.");

        ArticleDTO description = new ArticleDTO("ID00"+(id+1),name.get(id));
        return description;
    }
}
