package com.greencoxacademy.application.components.controllers;

import com.greencoxacademy.application.components.repositories.*;
import com.greencoxacademy.application.components.services.FoxServicesImpl;
import com.greencoxacademy.application.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxRepo foxRepo;
    private FoodRepo foodRepo;
    private UserRepo usersRepo;
    private DrinkRepo drinksRepo;
    private TricksRepo tricksRepo;


    @Autowired
    public FoxController(FoxRepo foxRepo, FoodRepo foodRepo, UserRepo usersRepo, DrinkRepo drinksRepo, TricksRepo tricksRepo) {
        this.foxRepo = foxRepo;
        this.drinksRepo = drinksRepo;
        this.foodRepo = foodRepo;
        this.tricksRepo = tricksRepo;
        this.usersRepo = usersRepo;
    }

    @GetMapping(value = {"/nutritionStore/{name}"})
    public String showNutritionStore(@PathVariable("name") String name, Model model) {
        model.addAttribute("page", "nutritionStore");
        model.addAttribute("food", foodRepo.findAll());
        model.addAttribute("drinks", drinksRepo.findAll());
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        return "nutritionStore";
    }

    @PostMapping(value = "/nutritionStore/{name}", params = {"food", "drink"})
    public String changeNutrition(@RequestParam("food") String food,
                                  @RequestParam("drink") String drink,
                                  @PathVariable("name") String name,
                                  Model model) {
        Fox fox = foxRepo.findFoxByName(name);
        fox.setFood(food);
        fox.setDrink(drink);
        foxRepo.save(fox);
        model.addAttribute("page", "nutritionStore");
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        return "nutritionStore";
    }

    @PostMapping(value = "/nutritionStore/{name}", params = "food")
    public String changeNutritionFoodOnly(@RequestParam("food") String food,
                                  @PathVariable("name") String name,
                                  Model model) {
        Fox fox = foxRepo.findFoxByName(name);
        fox.setFood(food);
        foxRepo.save(fox);
        model.addAttribute("page", "nutritionStore");
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        return "nutritionStore";
    }

    @PostMapping(value = "/nutritionStore/{name}", params = "drink")
    public String changeNutritionDrinkOnly(@RequestParam("drink") String drink,
                                           @PathVariable("name") String name,
                                           Model model) {
        Fox fox = foxRepo.findFoxByName(name);
        fox.setDrink(drink);
        foxRepo.save(fox);
        model.addAttribute("page", "nutritionStore");
        model.addAttribute("fox",  foxRepo.findFoxByName(name));
        return "nutritionStore";
    }


    @GetMapping(value = {"/trickCenter/{name}"})
    public String showTrickCenter(@PathVariable("name") String name, Model model) {
        model.addAttribute("page","trickCenter");
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        model.addAttribute("tricks", tricksRepo.findAll());

        return "trickCenter";
    }

    @PostMapping(value = "/trickCenter/{name}", params = "trick")
    public String changeNutrition(@RequestParam("trick") String trick,
                                  @PathVariable("name") String name,
                                  Model model) {
        Fox newFox = foxRepo.findFoxByName(name);
        newFox.addTrick(tricksRepo.findTrickByTrick(trick));
        foxRepo.save(newFox);
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        model.addAttribute("tricks", tricksRepo.findAll());
        return "trickCenter";
    }



    @GetMapping(value = "/adminPanel/{name}", name = "name")
    public String showAdministration(@PathVariable("name") String name, Model model) {
        model.addAttribute("foxes", foxRepo.findAll());
        model.addAttribute("fox", foxRepo.findFoxByName(name));
        model.addAttribute("page", "trickCenter");
        return "adminPanel";
    }

    @GetMapping(value = "/adminPanel/{name}/{foxToDelete}", name = "name")
    public String showAdministration(@PathVariable("name") String admin,
                                     @PathVariable("foxToDelete") String foxToDelete,
                                     Model model) {
        foxRepo.delete(foxRepo.findFoxByName(foxToDelete));
        model.addAttribute("page", "adminPanel");
        model.addAttribute("fox", foxRepo.findFoxByName(admin));
        return "redirect:/adminPanel/" + admin;
    }


}
