package com.greenfoxacademy.frontend.Controllers;

import com.greenfoxacademy.frontend.Models.*;
import com.greenfoxacademy.frontend.Repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    LogRepo logRepo;

    @Autowired
    public RestController(LogRepo logRepo) {
        this.logRepo = logRepo;
    }

    @GetMapping(value = "/doubling")
    public Doubling doubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            logRepo.save(new Log(LocalDateTime.now(), "/doubling", String.valueOf(input)));
            return new Doubling(input);
        } else {
            return new Doubling();
        }
    }

    @GetMapping(value = "/greeter")
    public Greeter greeter(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "title", required = false) String title) {
        if (name != null && title != null) {
            return new Greeter(name, title);
        } else if (name == null) {
            Greeter nameOnly = new Greeter();
            nameOnly.setError("Please provide a name!");
            return nameOnly;
        } else {
            Greeter titleOnly = new Greeter();
            titleOnly.setError("Please provide a title!");
            return titleOnly;
        }
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Appender appenda(@PathVariable("appendable") String append) throws ResourceNotFoundException {
        return new Appender(append);
    }

    @PostMapping(value = "/dountil/{action}")
    public DoUntil doUntil(@PathVariable("action") String action,
                           @RequestBody RequestedNumber number) {
        return new DoUntil(number.getUntil(), action);
    }

    @PostMapping(value = "/arrays")
    public HashMap<String, Object> arrays(@RequestBody ArrayHandler array) {
        HashMap<String, Object> map = new HashMap<>();
        if (array.getWhat().equalsIgnoreCase("sum")) {
            map.put("result", array.arraySum());
        } else if (array.getWhat().equalsIgnoreCase("multiply")) {
            map.put("result", array.arrayMultiply());
        } else if (array.getWhat().equalsIgnoreCase("double")) {
            map.put("numbers", array.arrayDouble());
        }
        return map;
    }

    @GetMapping(value = "/log")
}