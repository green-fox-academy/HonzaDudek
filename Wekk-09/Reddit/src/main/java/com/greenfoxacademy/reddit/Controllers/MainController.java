package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Repositories.RedditRepo;
import com.greenfoxacademy.reddit.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
