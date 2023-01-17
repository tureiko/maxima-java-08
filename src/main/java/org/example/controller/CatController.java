package org.example.controller;

import org.example.model.Cat;
import org.example.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CatController {

    @Autowired
    private CatService service;

    @GetMapping("/cats")
    public String getAllCats(Model model){
        model.addAttribute("cats", service.getAllCats());
        model.addAttribute("title", "Список котов");
        model.addAttribute("header_name", "Имя кота");
        return "cats";
    }

    @PostMapping("/cat")
    public String createCat(Cat cat, Model model){
        service.createCat(cat);
        model.addAttribute("cats", service.getAllCats());
        model.addAttribute("title", "Список котов");
        model.addAttribute("header_name", "Имя кота");
        return "cats";
    }
}
