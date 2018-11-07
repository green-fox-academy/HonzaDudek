package application.models.colors;

import application.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {


    @Autowired
    Printer printer;


    public static final String ANSI_BLUE = "\u001B[34m";

    @Override
    public void printColor() {
        System.out.println("This is a " + ANSI_BLUE  + "blue color" );
    }
}
