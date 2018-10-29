import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Excercise01 {

    //Write a Stream Expression to get the even numbers from the following array:
    private static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));


    public static void main(String[] args) {

        getEvenNumbers();
        System.out.println();

        getAverageFromOddNumbers();

    }


    private static void getEvenNumbers() {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    private static void getAverageFromOddNumbers() {
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n)
                .average();

        System.out.println(average.getAsDouble());
    }

}
