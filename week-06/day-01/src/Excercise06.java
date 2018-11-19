import java.util.ArrayList;
import java.util.Arrays;

public class Excercise06 {

    // Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
    private static ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    public static void main(String[] args) {
        cities.stream()
                .map(String::toLowerCase)
                .filter(city -> city.charAt(0) == 'a' && city.charAt(city.length()-1) == 'i')
                .forEach(System.out::println);
    }
}
