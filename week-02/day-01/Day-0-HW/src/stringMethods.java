public class stringMethods {
    public static void main(String[] args) {


        String s1 = "word";
        String s2 = "wordier word";

        // Updates the string to upper/lower case
        System.out.println(s1.toUpperCase());

        // Checks, whether the string starts or ends with specific string
        if (s1.endsWith("word")) {
            System.out.println("s1 starts with word");
        }

    }
}
