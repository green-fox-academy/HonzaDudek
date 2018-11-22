package com.greenfoxacademy.urlshortening.Controllers;

import com.greenfoxacademy.urlshortening.Models.Website;
import com.greenfoxacademy.urlshortening.Repositories.WebsiteRepo;
import com.greenfoxacademy.urlshortening.Services.WebsiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    WebsiteServices websiteServices;

    @Autowired
    public MainController(WebsiteServices websiteServices) {
        this.websiteServices = websiteServices;
    }

    @PostMapping("/save-link")
    public String shortenURL(@RequestParam("url") String url,
                      @RequestParam("alias") String alias, Model model) {
        if (websiteServices.createShortenedURL(url, alias) != null) {
            Website website = websiteServices.createShortenedURL(url, alias);
            model.addAttribute("website", website);
            return "index";
        } else {
            model.addAttribute("error", "Your alias is already in use!!!");
            return "index";
        }
    }
}
