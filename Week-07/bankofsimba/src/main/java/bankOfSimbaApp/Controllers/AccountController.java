package bankOfSimbaApp.Controllers;

import bankOfSimbaApp.Account;
import bankOfSimbaApp.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @RequestMapping("/show/{userName}")
    public String showBalance(Model model, @PathVariable String userName) {
        model.addAttribute("account", Users.getUser(userName));
        return "account-details";
    }

    @RequestMapping("/show/{userName}/raiseBalance")
    public String updateBalance(Model model, @PathVariable String userName) {
        Account user = Users.getUser(userName);
        user.raiseBalance();
        model.addAttribute("account",user);
        return "account-details";
    }

}
