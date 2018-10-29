import java.util.ArrayList;
import java.util.List;

public class MoneyConverter {
    public static void main(String[] args) {

    }


    public static String converting(int number) {
        int tens = number/10;
        String tensWord = "";
        int hundreds = number/100;
        String convertedString = " ";


        List<String> oneToTen = new ArrayList<>();
        oneToTen.add("one");
        oneToTen.add("two");
        oneToTen.add("three");
        oneToTen.add("four");
        oneToTen.add("five");
        oneToTen.add("six");
        oneToTen.add("seven");
        oneToTen.add("eight");
        oneToTen.add("nine");
        oneToTen.add("ten");

        List<String> elevenToNineteen = new ArrayList<>();
        elevenToNineteen.add("eleven");
        elevenToNineteen.add("twelve");
        elevenToNineteen.add("thirteen");
        elevenToNineteen.add("fourteen");
        elevenToNineteen.add("fifteen");
        elevenToNineteen.add("sixteen");
        elevenToNineteen.add("seventeen");
        elevenToNineteen.add("eighteen");
        elevenToNineteen.add("nineteen");

        List<String> twentyToNinety = new ArrayList<>();
        twentyToNinety.add("twenty");
        twentyToNinety.add("thirty");
        twentyToNinety.add("fourty");
        twentyToNinety.add("fifty");
        twentyToNinety.add("sixty");
        twentyToNinety.add("seventy");
        twentyToNinety.add("eighty");
        twentyToNinety.add("ninety");



        if (number <= 10) {
            for (int i = 1; i <= oneToTen.size(); i++) {
                if (number == i) {
                    return oneToTen.get(i-1);
                }
            }
        } else if (number > 10 && number < 20) {
            for (int i = 1; i <= elevenToNineteen.size(); i++) {
                if ((number - 10 ) == i) {
                    return elevenToNineteen.get(i-1);
                }
            }
        }else if (number >=20 && number < 100) {

            for (int i = 0; i < 10; i++) {
                if ((tens - 2)  == i) {
                    tensWord = twentyToNinety.get(i) + " ";
                }
            }
            for (int i = 0; i < 10; i++) {
                if (number%10 == i) {
                    tensWord += oneToTen.get(i-1);
                }
            }
            return tensWord;
        } else if (number >= 100 && number < 1000) {
            for (int i = 1; i < 10; i++) {
                if (hundreds == i) {
                    convertedString = oneToTen.get(i-1) + " hundred ";
                }
            }
            for (int i = 1; i < 10; i++) {
                    if (number == i) {
                        return oneToTen.get(i-1);
                    }
            }
        }

        return "zero";
    }

}
