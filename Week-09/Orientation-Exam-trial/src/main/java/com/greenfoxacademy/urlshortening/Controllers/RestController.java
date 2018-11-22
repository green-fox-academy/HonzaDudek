package com.greenfoxacademy.urlshortening.Controllers;

import com.greenfoxacademy.urlshortening.Models.IncomingSecretCode;
import com.greenfoxacademy.urlshortening.Models.Responses;
import com.greenfoxacademy.urlshortening.Services.WebsiteServices;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    WebsiteServices websiteServices;

    @Autowired
    public RestController(WebsiteServices websiteServices) {
        this.websiteServices = websiteServices;
    }

    @GetMapping("/api/links")
    public Object sendLinks() {
        return websiteServices.ListAllWebsites();
    }

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity deleteLink(@PathVariable(value = "id") long id,
                                     @RequestBody(required = false) IncomingSecretCode secretCode) {
        if (!websiteServices.findById(id).isPresent()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else if (websiteServices.findById(id).get().getSecretCode() != secretCode.getSecretCode()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            websiteServices.deleteById(id);
            return new ResponseEntity(HttpStatus.valueOf(204));
        }
    }
}
