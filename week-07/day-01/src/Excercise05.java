import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise05 {

    private static String testString = "HeLlo World!";

    public static void main(String[] args) {
        findUpperCase();
    }

    public static void findUpperCase() {
        testString.chars()
                .filter(Character::isUpperCase)
                .mapToObj(ch -> Character.toString((char)ch))
                .forEach(System.out::println);
    }

}
