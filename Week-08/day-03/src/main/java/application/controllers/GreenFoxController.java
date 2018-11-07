package application.controllers;

import application.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreenFoxController {

    StudentService students;

    @RequestMapping(value = "/gfa/list")
    public String listAllStudents(Model model) {
        model.addAttribute("listOfStudents", students.findAll());
        return "list";
    }

}
