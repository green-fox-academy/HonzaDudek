import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Excercise08 {

    // Write a Stream Expression to find the frequency of numbers in the following array:
    private static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    public static void main(String[] args) {

        Map<Integer, Integer> frequency = new HashMap<>();
        frequency = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(n -> 1)));

        System.out.println(frequency);
    }
}
