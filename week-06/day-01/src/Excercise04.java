import java.util.ArrayList;
import java.util.Arrays;

public class Excercise04 {

    //Write a Stream Expression to find which number squared value is more then 20 from the following array:
    private static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    public static void main(String[] args) {

        getSquaredValuesHigherThanTwenty();

    }

    public static void getSquaredValuesHigherThanTwenty() {
        numbers.stream()
                .filter(n -> n * n > 20)
                .forEach(n -> System.out.print(n + " "));
    }

}
