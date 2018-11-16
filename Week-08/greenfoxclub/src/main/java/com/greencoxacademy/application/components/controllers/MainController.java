package com.greencoxacademy.application.components.controllers;

import com.greencoxacademy.application.components.repositories.*;
import com.greencoxacademy.application.models.Drink;
import com.greencoxacademy.application.models.Food;
import com.greencoxacademy.application.models.Fox;
import com.greencoxacademy.application.models.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;


@Controller
public class MainController {

    private FoxRepo foxRepo;
    private FoodRepo foodRepo;
    private UserRepo usersRepo;
    private DrinkRepo drinksRepo;
    private TricksRepo tricksRepo;


    @Autowired
    public MainController(FoxRepo foxRepo, FoodRepo foodRepo, UserRepo usersRepo, DrinkRepo drinksRepo, TricksRepo tricksRepo) {
        this.foxRepo = foxRepo;
        this.drinksRepo = drinksRepo;
        this.foodRepo = foodRepo;
        this.tricksRepo = tricksRepo;
        this.usersRepo = usersRepo;
    }

    @GetMapping(value = "/{name}")
    public String indexLoggedIn(@PathVariable("name") String name, Model model) {

        Fox fox = foxRepo.findFoxByName(name);
        Set<Fox> foxSet = new HashSet<>();
        foxSet.add(fox);
        fox.eating();
        fox.drinking();
        foxRepo.save(fox);
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        model.addAttribute("tricks", tricksRepo.findAllByFoxes(foxSet));
        model.addAttribute("page", "index");
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

    @PostMapping(value = "/login")
    public String logIn(@RequestParam("porky") String name) {
        if (foxRepo.findFoxByName(name) == null) {
            Fox newFox = new Fox(name);
            if (name.equalsIgnoreCase("honza")) {
                newFox.setAdmin(true);
            }
            foxRepo.save(newFox);
        }
        return "redirect:/" + name;
    }

    @GetMapping(value = "/admin/deleteAll")
    public String deleteAll() {
        foxRepo.deleteAll();
        return "login";
    }


}

