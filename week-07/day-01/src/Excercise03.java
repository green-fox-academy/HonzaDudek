import java.util.*;

public class Excercise03 {

    // Write a Stream Expression to get the squared value of the positive numbers from the following array:
    private static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    public static void main(String[] args) {

        getSquaredValueOfPositiveNumbers();
        System.out.println();
        System.out.println(getTotalSquaredValueOfPositiveNumbers());

    }

    public static void getSquaredValueOfPositiveNumbers() {
        numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    public static int getTotalSquaredValueOfPositiveNumbers() {
        int total = numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(Integer::intValue)
                .sum();
        total = total * total;
        return total;
    }
}
