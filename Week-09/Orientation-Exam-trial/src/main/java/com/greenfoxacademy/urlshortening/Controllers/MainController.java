package com.greenfoxacademy.urlshortening.Controllers;

import com.greenfoxacademy.urlshortening.Models.Website;
import com.greenfoxacademy.urlshortening.Repositories.WebsiteRepo;
import com.greenfoxacademy.urlshortening.Services.WebsiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

    WebsiteServices websiteServices;

    @Autowired
    public MainController(WebsiteServices websiteServices) {
        this.websiteServices = websiteServices;
    }

    @GetMapping("/")
    public String homepage() {
        return "index";
    }

    @PostMapping("/save-link")
    public String shortenURL(@RequestParam("url") String url,
                             @RequestParam("alias") String alias, Model model, RedirectAttributes attributes) {
        Website website = websiteServices.createShortenedURL(url, alias);

        if (website!= null) {
            model.addAttribute("website", website);
            attributes.addAttribute("website", website);
            return "index";
        } else {
            model.addAttribute("error", "Your alias is already in use!!!");
            attributes.addAttribute("error", "Your alias is already in use!!!");

            return "index";
        }
    }

    @GetMapping("/a/{alias}")
    public Object goToAlias(@PathVariable(value = "alias") String alias) {
        if (websiteServices.findURLbyAlias(alias) == null ) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Selected alias does not exist");
        } else {
            Website website = websiteServices.findURLbyAlias(alias);
            websiteServices.increaseHitCount(alias);
            return "redirect:" + website.getUrl();
        }
    }
}
