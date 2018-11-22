package com.greenfoxacademy.urlshortening.Services;

import com.greenfoxacademy.urlshortening.Models.Website;
import com.greenfoxacademy.urlshortening.Repositories.WebsiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebsiteServices {

    WebsiteRepo repo;

    @Autowired
    public WebsiteServices(WebsiteRepo repo) {
        this.repo = repo;
    }

    public void createShortenedURL(String url, String alias) {
        Website newWebsite = new Website(url, alias);
        repo.save(newWebsite);
    }

}
