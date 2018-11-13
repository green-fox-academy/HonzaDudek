package com.greenfoxacademy.application.controllers;


import com.greenfoxacademy.application.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ToDoController {

    private ToDoRepo repo;

    @Autowired
    public ToDoController(ToDoRepo repo) {
        this.repo = repo;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }


}
