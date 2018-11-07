package application.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    String eMail;
    boolean isValid;


    ArrayList<String> colors;
    Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {


        return colors.get(random.nextInt(colors.size()));
    }

    public String validateEmail(String email) {
        this.eMail = email;
        if (eMail.contains("@") && eMail.contains(".")) {
            this.isValid = true;
            return ANSI_GREEN + eMail + " is valid";
        } else {
            this.isValid = false;
            return ANSI_RED + eMail + " is NOT valid";
        }
    }

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
