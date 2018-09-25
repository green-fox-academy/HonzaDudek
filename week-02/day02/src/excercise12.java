import java.util.ArrayList;
import java.util.Arrays;

public class excercise12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }

    public static String quoteSwap(ArrayList quote) {
        String a = quote.get(2).toString();
        String c = a;
        String b = quote.get(5).toString();
        quote.set(2, b);
        quote.set(5, c);
        String finalQuote = String.join(" ", quote);
        return finalQuote;
    }
}
