package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.Doubling;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping(value = "/doubling")
    public Doubling doubling(@RequestParam(value = "input", required = false) Integer input){
        if (input != null) {
            return new Doubling(input);
        }
        else {
            return new Doubling();
        }
    }

}
