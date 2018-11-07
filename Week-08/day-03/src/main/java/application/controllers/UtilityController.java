package application.controllers;

import application.services.utility.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    @Autowired
    UtilityService service;

    @RequestMapping("/useful")
    public String showUsefulUtilities() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String colorBackground(Model model) {
        model.addAttribute("service", service.randomColor());
        return "colored";
    }

    @RequestMapping(value = "/useful/email")
    public String validateEmail() {
        return  "email";
    }

    @RequestMapping(value = "/useful/email/validate" , name = "email", params = "email")
    public String validateEmail(Model model, @RequestParam("email") String email) {
        model.addAttribute("service", service.validateEmail(email));
        model.addAttribute("isValid", service.isValid());
        return  "email";
    }

    @RequestMapping(value = "/useful/caesar")
    public String caesar() {
        return "caesar";
    }

    @RequestMapping(value = "/useful/caesar/decoded" , name = "email", params = {"caesarText", "caesarNumber"})
    public String validateEmail(Model model, @RequestParam("caesarText") String text, @RequestParam("caesarNumber") int number) {
        model.addAttribute("service", service.caesar(text, number));
        return  "caesar";
    }

}
