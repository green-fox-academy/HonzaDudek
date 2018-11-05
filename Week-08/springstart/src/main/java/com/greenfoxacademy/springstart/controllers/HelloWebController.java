package com.greenfoxacademy.springstart.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong id = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam(name="name")String name) {
        model.addAttribute("id", id.getAndIncrement());
        model.addAttribute("name", name);
        return "greeting";
    }

}
