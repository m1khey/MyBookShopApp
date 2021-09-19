package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.AuthorService;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorsPageController {

    private final AuthorService authorService;

    @Autowired
    public AuthorsPageController(AuthorService authorService){
        this.authorService=authorService;
    }

    @RequestMapping("/authors")
    public String mainPage(Model model){
        model.addAttribute("authorData", authorService.getAuthorsData());

        return "authors";
    }
}
