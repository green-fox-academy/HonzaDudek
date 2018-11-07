package application.models.colors;

public class YellowColor implements MyColor {

    public static final String ANSI_YELLOW = "\u001B[33m";


    @Override
    public void printColor() {
        System.out.println("This is a " + ANSI_YELLOW  + "yellow color");
    }
}
