package com.greenfoxacademy.frontend.Controllers;

import com.fasterxml.jackson.core.JsonParser;
import com.greenfoxacademy.frontend.Models.*;
import com.greenfoxacademy.frontend.Repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    LogRepo logRepo;

    @Autowired
    public RestController(LogRepo logRepo) {
        this.logRepo = logRepo;
    }

    @GetMapping(value = "/doubling")
    public Doubling doubling(@RequestParam(value = "input", required = false) Integer input,
                             HttpServletRequest req) {
        if (input != null) {
            logRepo.save(new Log(LocalDateTime.now(), "/doubling", paramsToString(req)));
            return new Doubling(input);
        } else {
            return new Doubling();
        }
    }

    @GetMapping(value = "/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "title", required = false) String title,
                           HttpServletRequest req) {
        if (name != null && title != null) {
            logRepo.save(new Log(LocalDateTime.now(), "/greeter", paramsToString(req)));
            return new WelcomeMessage(name, title);
        } else if (name == null) {
            return new WelcomeMessage("name");
        } else {
            return new WelcomeMessage("title");
        }
    }

    @GetMapping(value = "/appenda/{appendable}")
    public Appender appenda(@PathVariable("appendable") String append) throws ResourceNotFoundException {
        return new Appender(append);
    }

    @PostMapping(value = "/dountil/{action}")
    public Object doUntil(@PathVariable("action") String action,
                          @RequestBody RequestedNumber number) {
        try {
                logRepo.save(new Log(LocalDateTime.now(), "/dountil", action + " : " + number.getUntil().toString()));
                return new DoUntil(number.getUntil(), action);
        } catch (NullPointerException e) {
        return new Errors("Please provide a number!");
        }
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
    public List<Log> log() {
        return logRepo.findAll();
    }

    public String paramsToString(HttpServletRequest req) {
        String params = "";
        for (String key:  req.getParameterMap().keySet()
             ) {
            params += key +"= ";
            for (String value : req.getParameterValues(key)
                 ) {
                params += value + "/";
            }
        }
        return params;
    }

    @GetMapping(value = "/deleteAll")
    public String deleteAll() {
        logRepo.deleteAll();
        return "index";
    }
}