package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

    @GetMapping("/test")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("message", name);
        return "test_page";
    }

}
