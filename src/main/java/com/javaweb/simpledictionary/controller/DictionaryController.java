package com.javaweb.simpledictionary.controller;

import com.javaweb.simpledictionary.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    Iservice dictionaryService;

    @GetMapping("/dictionary")
    public String dictionary() {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public String translate(@RequestParam("word") String word, Model model) {
        String res = dictionaryService.translate(word.toLowerCase());
        model.addAttribute("result", res);
        return "dictionary";
    }

}
