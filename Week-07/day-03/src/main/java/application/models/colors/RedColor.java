package application.models.colors;

import application.services.utility.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RedColor implements MyColor {

    public static final String ANSI_RED = "\u001B[31m";


    @Autowired
    Printer printer;


    @Override
    public void printColor() {
        printer.log("This is a " + ANSI_RED + "red color");
    }
}
