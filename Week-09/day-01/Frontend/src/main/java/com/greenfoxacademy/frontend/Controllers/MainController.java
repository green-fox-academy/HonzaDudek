package com.greenfoxacademy.frontend.Controllers;
import com.greenfoxacademy.frontend.Models.Doubling;
import com.greenfoxacademy.frontend.Repositories.LogRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    LogRepo logRepo;

    public MainController(LogRepo logRepo) {
        this.logRepo = logRepo;
    }
}
