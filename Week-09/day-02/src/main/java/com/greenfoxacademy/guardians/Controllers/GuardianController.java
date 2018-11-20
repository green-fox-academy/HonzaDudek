package com.greenfoxacademy.guardians.Controllers;


import com.greenfoxacademy.guardians.Models.Errors;
import com.greenfoxacademy.guardians.Models.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value = "/groot")
    public Object translateToGroot(@RequestParam(value = "message", required = false) String received) {
        if (received != null) {
            return new Groot(received);
        } else {
            return new Errors("I am Groot!");
        }
    }
}
