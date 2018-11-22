package com.greenfoxacademy.urlshortening.Services;

import com.greenfoxacademy.urlshortening.Models.Website;
import com.greenfoxacademy.urlshortening.Repositories.WebsiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebsiteServices {

    WebsiteRepo repo;

    @Autowired
    public WebsiteServices(WebsiteRepo repo) {
        this.repo = repo;
    }

    public Website createShortenedURL(String url, String alias) {
        if (repo.findByAlias(alias) == null) {
            Website newWebsite = new Website(url, alias);
            repo.save(newWebsite);
            return newWebsite;
        } else {
            return null;
        }
    }

    public Website findURLbyAlias(String alias) {
        return repo.findByAlias(alias);
    }

    public void increaseHitCount(String alias) {
        Website website = repo.findByAlias(alias);
        website.increaseHitCount();
        repo.save(website);
    }

    public List<Website> ListAllWebsites() {
        return repo.findAll();
    }

    public Optional<Website> findById(long id) {
        return repo.findById(id);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }
}
