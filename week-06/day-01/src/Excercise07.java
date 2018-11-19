import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Excercise07 {

    // Write a Stream Expression to find the frequency of characters in a given string!
    private static String testString = "HeLlo World!";

    public static void main(String[] args) {
        Map<Character, Integer> frequency = testString.chars()
                .mapToObj(c -> (char)c)
                .map(Character::toLowerCase)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
        System.out.println(frequency);
    }
}
