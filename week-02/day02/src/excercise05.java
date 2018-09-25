public class excercise05 {
    public static void main(String[] args) {
        reverse(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");
        reverse2(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");

    }
    // Method one
    public static void reverse(String stringToReverse) {
        StringBuilder lastChar = new StringBuilder(stringToReverse);
        lastChar.append(" ");
        String reversedString = "";
        for (int i = 0; i < stringToReverse.length(); i++) {
            char a;
            a = stringToReverse.charAt(stringToReverse.length()-i-1);
            reversedString += a;
        }
        stringToReverse = reversedString;
        System.out.println(stringToReverse);
    }

    // Method two
    public static void reverse2(String stringToReverse) {
        StringBuilder reversedString = new StringBuilder(stringToReverse);
        reversedString.reverse();
        System.out.println(reversedString);
    }
}
