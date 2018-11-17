package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Repositories.RedditRepo;
import com.greenfoxacademy.reddit.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private RedditRepo redditsRepo;
    private UserRepo usersRepo;

    @Autowired
    public MainController(RedditRepo redditsRepo, UserRepo usersRepo) {
        this.redditsRepo = redditsRepo;
        this.usersRepo = usersRepo;
    }

    @GetMapping(value = {"/", "login"})
    public String login(Model model) {
        model.addAttribute("page", "login");
        return "login";
    }

    @PostMapping(value = "/login")
    public String userCreated(@RequestParam(value = "username") String username,
                              @RequestParam(value = "password") String password,
                              Model model) {
        usersRepo.save(new User(username, password));
        model.addAttribute("page", "login");
        return "login";
    }

    @GetMapping(value = "/createProfile")
    public String createProfile(Model model) {
        model.addAttribute("page", "login");
        return "createProfile";
    }

    @PostMapping(value = {"/{id}"})
    public String login(@RequestParam(name = "username") String username,
                        @RequestParam(name = "password") String password,
                        Model model) {
        if (usersRepo.findByUsername(username) != null) {
            if (usersRepo.findByUsername(username).getPassword().equals(password)) {
                model.addAttribute("page", " ");
                model.addAttribute("user", usersRepo.findByUsername(username));
                model.addAttribute("reddits", redditsRepo.findAll());
                return "index";
            } else {
                return "login";
            }
        } else {
            return "createProfile";
        }
    }

    @GetMapping(value = "/admin/deleteAll")
    public String deleteAll() {
        usersRepo.deleteAll();
        redditsRepo.deleteAll();
        return "createProfile";
    }

}
