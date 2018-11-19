package com.greenfoxacademy.frontend.Controllers;
import com.greenfoxacademy.frontend.Models.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }


}
