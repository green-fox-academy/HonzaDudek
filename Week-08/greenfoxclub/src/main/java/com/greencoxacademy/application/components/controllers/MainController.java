package com.greencoxacademy.application.components.controllers;

import com.greencoxacademy.application.components.repositories.FoxRepo;
import com.greencoxacademy.application.components.services.FoxServicesImpl;
import com.greencoxacademy.application.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    private FoxRepo repo;

    @Autowired
    FoxServicesImpl foxesInFile;

    @Autowired
    public MainController(FoxRepo repo) {
        this.repo = repo;
    }

    @GetMapping(value = "/{name}")
    public String indexLoggedIn(@PathVariable("name") String name, Model model) {
        model.addAttribute("fox", repo.findFoxByName(name));
        return "index";
    }

    @GetMapping(value = "/")
    public String index() {
        return "login";
    }

    @GetMapping(value = {"/login"})
    public String showLoginPage() {
        return "login";
    }

    @PostMapping(value = "/login/loggedIn")
    public String logIn(@RequestParam("porky") String name, Model model) {
        if (repo.findAll() == null) {
            Fox newFox = new Fox(name);
            newFox.setFood(foxesInFile.getRandomElement(foxesInFile.getListOfFood()));
            newFox.setDrink(foxesInFile.getRandomElement(foxesInFile.getListOfDrinks()));
            if (name.equalsIgnoreCase("honza")) {
                newFox.setAdmin(true);
            }
            repo.save(newFox);
        }
        return "redirect:/" + name;
    }

}

