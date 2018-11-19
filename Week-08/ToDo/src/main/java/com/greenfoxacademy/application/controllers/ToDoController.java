package com.greenfoxacademy.application.controllers;


import com.greenfoxacademy.application.models.ToDo;
import com.greenfoxacademy.application.repositories.ToDoRepo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private ToDoRepo repo;

    @Autowired
    public ToDoController(ToDoRepo repo) {
        this.repo = repo;
    }

    @GetMapping({"/", "/list"})
    public String listAll(Model model, @RequestParam(value = "isUrgent", defaultValue = "false") boolean urgent,
                          @RequestParam(value = "isDone", defaultValue = "false") boolean done) {
        if (urgent) {
            model.addAttribute("todos", repo.findUrgent());
        } else if (done) {
            model.addAttribute("todos", repo.findDone());
        } else if (done && urgent) {
            model.addAttribute("todos", repo.findDoneAndUrgent());
        } else {
            model.addAttribute("todos", repo.findAllByOrderByIdAsc());
        }
        return "todolist";
    }

    @PostMapping("/add")
    public String addToDo(@RequestParam(name = "todo") String newTodo) {
        repo.save(new ToDo(newTodo));
        return "redirect:/todo/list";
    }

    @GetMapping("/add")
    public String addToDo() {
        return "add";
    }

    @GetMapping("/{id}/delete")
    public String deleteToDo(@PathVariable("id") long id) {
        repo.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/update")
    public String updateToDo(@PathVariable("id") long id, Model model) {
        model.addAttribute("todoTitle", repo.findById(id).get().getTitle());
        model.addAttribute("todo", repo.findById(id));

        return "update";
    }

    @PostMapping("/{id}/update")
    public String updateToDo(ToDo newTodo) {
        repo.save(newTodo);
        return "redirect:/todo/list";
    }

}
