package bankOfSimbaApp.Controllers;

import bankOfSimbaApp.Account;
import bankOfSimbaApp.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {


    @RequestMapping("/users")
    public String showAccountUsers(Model model) {
        model.addAttribute("users", new Users().getListOfUsers());
        return "users";
    }
}
