import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Excercise09 {

    // Write a Stream Expression to convert a char array to a string!
    public static char[] letters = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

    public static void main(String[] args) {

        List<Character> lettersList = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            lettersList.add(letters[i]);
        }

        String finalString = lettersList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        System.out.println(finalString);
    }
}
