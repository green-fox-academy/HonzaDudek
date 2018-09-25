public class excercise03 {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder quoteupdate = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        quoteupdate.insert(quoteupdate.indexOf("you"), "always takes longer than ");

        System.out.println(quoteupdate);

    }
}
