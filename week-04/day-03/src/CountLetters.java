import java.util.HashMap;

public class CountLetters {

    public String stringToCount = "";
    public HashMap<Character, Integer> dictionary = new HashMap<>();

    public HashMap<Character, Integer> countLetters(String stringToCount) {
        int counter = 0;
        for (int i = 0; i < stringToCount.length(); i++) {
            for (int j = 0; j < stringToCount.length(); j++) {
                if (stringToCount.charAt(i) == stringToCount.charAt(j)) {
                    counter++;
                }
                dictionary.put(stringToCount.charAt(i), counter);
            }
            counter =0;
        }
        return dictionary;
    }

        public static void main (String[]args){
            CountLetters countLetters = new CountLetters();
            countLetters.stringToCount = "Karelle";
            System.out.println(countLetters.countLetters(countLetters.stringToCount));
        }
}

