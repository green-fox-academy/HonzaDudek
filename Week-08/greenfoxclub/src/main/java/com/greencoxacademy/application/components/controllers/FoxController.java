package com.greencoxacademy.application.components.controllers;

import com.greencoxacademy.application.components.services.FoxServicesImpl;
import com.greencoxacademy.application.components.services.FoxServicesToFile;
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

    @Autowired
    FoxServicesToFile foxesInFile;

    @GetMapping(value = {"/nutritionStore/{name}"})
    public String showNutritionStore(@PathVariable("name") String name, Model model) {
        model.addAttribute("fox", foxesInFile.getFox(name));
        return "nutritionStore";
    }

    @PostMapping(value = "/nutritionStore/{name}", params = {"food", "drink"})
    public String changeNutrition(@RequestParam("food") String food,
                                  @RequestParam("drink") String drink,
                                  @PathVariable("name") String name,
                                  Model model) {
        Fox newFox = new Fox(name);
        newFox.setFood(food);
        newFox.setDrink(drink);
        foxesInFile.updateFox(foxesInFile.getFox(name), newFox);
        model.addAttribute("fox", foxesInFile.getFox(name));
        return "nutritionStore";
    }


    @GetMapping(value = {"/trickCenter/{name}"})
    public String showTrickCenter(@PathVariable("name") String name, Model model) {
        model.addAttribute("fox", foxesInFile.getFox(name));
        return "trickCenter";
    }

    @PostMapping(value = "/trickCenter/{name}", params = "trick")
    public String changeNutrition(@RequestParam("trick") String trick,
                                  @PathVariable("name") String name,
                                  Model model) {
        Fox newFox = foxesInFile.getFox(name);
        newFox.setTrick(trick);
        foxesInFile.updateFox(foxesInFile.getFox(name), newFox);
        model.addAttribute("fox", foxesInFile.getFox(name));
        model.addAttribute("tricks", foxesInFile.getFox(name).getListOfTricks());
        return "trickCenter";
    }


    @GetMapping(value = "/adminPanel/{name}", name = "name")
    public String showAdministration(@PathVariable("name") String name, Model model) {
        model.addAttribute("foxes", foxesInFile.listAll());
        model.addAttribute("fox", foxesInFile.getFox(name));
        return "adminPanel";
    }

    @GetMapping(value = "/adminPanel/{name}/{foxToDelete}", name = "name")
    public String showAdministration(@PathVariable("name") String admin,
                                     @PathVariable("foxToDelete") String foxToDelete,
                                     Model model) {
        Fox fox = foxesInFile.getFox(foxToDelete);
        foxesInFile.delete(fox);
        model.addAttribute("fox", foxesInFile.getFox(admin));
        return "redirect:/adminPanel/" + admin;
    }


}
