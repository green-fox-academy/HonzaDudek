package bankOfSimbaApp.Controllers;

import bankOfSimbaApp.Account;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @RequestMapping("/show")
    public String showBalance(Model model, User user) {
        model.addAttribute("account", user);
        return "account-details";
    }

}
