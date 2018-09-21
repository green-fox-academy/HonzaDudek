import java.util.Scanner;

public class palindromeCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String base = scanner.nextLine();

        System.out.println(base);
        System.out.println(base.length());

        for (int i = base.length() - 1; i >= 0; i--) {
            char a = base.charAt(i);
            String palindrome = " ";
            base += a;
        }
        System.out.println(base);
    }
}
